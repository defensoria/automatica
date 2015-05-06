/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.simco.defensoria.timer;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import org.apache.commons.lang3.StringUtils;
import pe.com.simco.defensoria.model.Alerta;
import pe.com.simco.defensoria.model.SeguimientoAcuerdo;
import pe.com.simco.defensoria.service.AlertaService;
import pe.com.simco.defensoria.service.SeguimientoAcuerdoService;


/**
 *
 * @author carlos
 */
@Stateless
public class TimerAlertService implements Serializable{
    
    @EJB
    private SeguimientoAcuerdoService seguimientoAcuerdoService;
    
    @EJB
    private AlertaService alertaService;
    
    @Schedule(second = "10", minute = "4", hour = "17")
    public void envioAutomaticoAlertas(){
        Date hoy = new Date();
        List<SeguimientoAcuerdo> list = seguimientoAcuerdoService.listarPendientes();

        for(SeguimientoAcuerdo seguimientoAcuerdo: list){
        Date fechaInicio = new Date();
        Date fechaFin = new Date();
            //verficiar hora inicio
            if(seguimientoAcuerdo.isIndicadorSeleccionHoraIni()){
                fechaInicio = seguimientoAcuerdo.getInicioDefinitivo();
            }else{
                if(StringUtils.equals(seguimientoAcuerdo.getIndicadorAntesDespuesIni(), "ANT")){
                    fechaInicio =  sumarRestarDiasFecha(seguimientoAcuerdo.getInicioSeguimiento(), seguimientoAcuerdo.getNumeroInicial()*(-1));
                }
                if(StringUtils.equals(seguimientoAcuerdo.getIndicadorAntesDespuesIni(), "DES")){
                    fechaInicio =  sumarRestarDiasFecha(seguimientoAcuerdo.getInicioSeguimiento(), seguimientoAcuerdo.getNumeroInicial());
                }  
            }
            
            //verificar hora fin
            if(seguimientoAcuerdo.isIndicadorSeleccionHoraFin()){
                fechaFin = seguimientoAcuerdo.getFinDefinitivo();
            }else{
                if(StringUtils.equals(seguimientoAcuerdo.getIndicadorAntesDespuesFin(), "ANT")){
                    fechaFin =  sumarRestarDiasFecha(seguimientoAcuerdo.getFinSeguimiento(), seguimientoAcuerdo.getNumeroFinal()*(-1));
                }
                if(StringUtils.equals(seguimientoAcuerdo.getIndicadorAntesDespuesFin(), "DES")){
                    fechaFin =  sumarRestarDiasFecha(seguimientoAcuerdo.getFinSeguimiento(), seguimientoAcuerdo.getNumeroFinal());
                }  
            }
            try {
                if(fechaInicio.before(hoy)){
                    if(sumarRestarDiasFecha(fechaFin,1).after(hoy)){
                        Alerta alerta = new Alerta();
                        alerta.setFechaEnvio(new Date());
                        alerta.setDescripcion("Nueva Alerta");
                        alerta.setId(null);
                        alerta.setEstado("PEN");
                        alerta.setSeguimientoAcuerdo(seguimientoAcuerdo);
                        alertaService.saveAlerta(alerta);
                        correo();
                    }
                }
            } catch (Exception e) {
                System.out.println(seguimientoAcuerdo.getId());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            
            //seguimientoAcuerdo.setInicio(fechaInicio);
            //seguimientoAcuerdo.setFin(fechaFin);
        }
    }
    
    public Date sumarRestarDiasFecha(Date fecha, int dias) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe	
        calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0	
        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos	
    }
    
    public void correo(){
            	Mail mail = new Mail();	
		//tblEmailDetalle.setNIdDestinatarioPersona(tblEmailPersona.getNIdEmail());
		mail.send("careli_2710@hotmail.com","asunto","cuerpo");
                
	}
    
}
