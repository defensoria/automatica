/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.simco.defensoria.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import pe.com.simco.defensoria.dao.SeguimientoAcuerdoDao;
import pe.com.simco.defensoria.model.SeguimientoAcuerdo;

/**
 *
 * @author carlos
 */
@Stateless
public class SeguimientoAcuerdoServiceImpl implements SeguimientoAcuerdoService{
    
    @EJB
    private SeguimientoAcuerdoDao seguimientoAcuerdoDao;

    @Override
    public List<SeguimientoAcuerdo> listarPendientes() {
        return seguimientoAcuerdoDao.listarPendientes();
    }
    
}
