/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.simco.defensoria.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pe.com.simco.defensoria.model.Noticia;

/**
 *
 * @author carlos
 */
@Stateless
public class NoticiaDAOImpl implements NoticiaDAO{
    
    @PersistenceContext(unitName = "AutomaticaAlertaEJBPU")
    private EntityManager em;

    @Override
    public void saveRSS(Noticia noticia) {
        try {
            em.persist(noticia);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
        
    }
    
}
