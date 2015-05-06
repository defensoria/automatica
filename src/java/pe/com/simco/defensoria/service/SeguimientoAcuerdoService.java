/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.simco.defensoria.service;

import java.util.List;
import pe.com.simco.defensoria.model.SeguimientoAcuerdo;

/**
 *
 * @author carlos
 */
public interface SeguimientoAcuerdoService {
    
    public List<SeguimientoAcuerdo> listarPendientes();
    
}
