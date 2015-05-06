/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.simco.defensoria.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import pe.com.simco.defensoria.dao.AlertaDao;
import pe.com.simco.defensoria.model.Alerta;

/**
 *
 * @author carlos
 */
@Stateless
public class AlertaServiceImpl implements AlertaService{
    
    @EJB
    private AlertaDao alertaDao;

    @Override
    public void saveAlerta(Alerta alerta) {
        alertaDao.saveAlerta(alerta);
    }
    
}
