/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.simco.defensoria.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pe.com.simco.defensoria.model.Alerta;

/**
 *
 * @author carlos
 */
@Stateless
public class AlertaDaoImpl implements AlertaDao{
    
    @PersistenceContext(unitName = "AutomaticaAlertaEJBPU")
    private EntityManager em;

    @Override
    public Alerta saveAlerta(Alerta alerta) {
        try {
            em.persist(alerta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return alerta;
    }
    
}
