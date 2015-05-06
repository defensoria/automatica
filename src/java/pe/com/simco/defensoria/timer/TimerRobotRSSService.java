/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.simco.defensoria.timer;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import pe.com.simco.defensoria.dao.CanalDAO;
import pe.com.simco.defensoria.dao.NoticiaDAO;
import pe.com.simco.defensoria.model.Canal;
import pe.com.simco.defensoria.model.Feed;
import pe.com.simco.defensoria.model.FeedMessage;
import pe.com.simco.defensoria.model.Noticia;
import pe.com.simco.defensoria.read.RSSFeedParser;

/**
 *
 * @author carlos
 */
@Stateless
public class TimerRobotRSSService implements Serializable {

    @EJB
    private NoticiaDAO noticiasDAO;

    @EJB
    private CanalDAO canalDAO;

    @Schedule(second = "0", minute = "43", hour = "16")
    public void generaNoticiaRSS() {
        List<Canal> listaCanalesRSS = canalDAO.listaCanales();
        for (Canal canal : listaCanalesRSS) {
            RSSFeedParser parser = new RSSFeedParser(canal.getRss());
            Feed feed = null;
            try {
                feed = parser.readFeed();
            } catch (Exception e) {
                System.out.println(e.getCause());
            }
            if (feed != null) {
                for (FeedMessage message : feed.getMessages()) {
                    try {
                        Noticia noticia = new Noticia();
                        noticia.setDescripcion(message.getDescription());
                        noticia.setTitulo(message.getTitle());
                        noticia.setLink(message.getGuid());
                        noticia.setFechaPublica(message.getUpdate());
                        noticia.setFechaRegistro(new Date());
                        noticia.setEmpresa(canal.getNombre());
                        noticia.setRegion(canal.getRegion());
                        noticiasDAO.saveRSS(noticia);
                    } catch (Exception e) {
                        System.out.println(e.getCause());
                    }
                }
            }
        }
    }
}
