/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.simco.defensoria.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import pe.com.simco.defensoria.dao.CanalDAO;
import pe.com.simco.defensoria.model.Canal;

/**
 *
 * @author carlos
 */
@Stateless
public class CanalServiceImpl implements CanalService{

    @EJB
    private CanalDAO canalDAO;
    
    @Override
    public List<Canal> listaCanales() {
        return canalDAO.listaCanales();
    }
    
}
