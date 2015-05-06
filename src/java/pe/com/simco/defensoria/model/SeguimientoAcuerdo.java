/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.simco.defensoria.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author carlos
 */
@Entity
@Table(name="SIMCO_SEG_ACUERDOS")
public class SeguimientoAcuerdo implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="N_ID_SEGUIEMIENTO")
    private Long id;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="D_FECINISEGUIMIENTO")
    private Date inicioSeguimiento;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="D_FECFINSEGUIMIENTO")
    private Date finSeguimiento;
    
    @Column(name="C_INDTIPOTIEMPOINI")
    private String tipoTiempoIni;
    
    @Column(name="C_INDTIPOTIEMPOFIN")
    private String tipoTiempoFin;
    
    @Column(name="N_NUMEROTIEMPOINI")
    private Integer numeroInicial;
    
    @Column(name="N_NUMEROTIEMPOFIN")
    private Integer numeroFinal;
    
    @Column(name="C_INDANTESDESPUESINI")
    private String indicadorAntesDespuesIni;
    
    @Column(name="C_INDANTESDESPUESFIN")
    private String indicadorAntesDespuesFin;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="D_FECINISEGUIMIENTOFINAL")
    private Date inicioDefinitivo;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="D_FECFINSEGUIMIENTOFINAL")
    private Date finDefinitivo;
    
    @Column(name="C_INDLUNVIER")
    private String indicadorLunesViernes;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="D_ULTIMAEJECUCION")
    private Date ultimaEjecucion;
    
    @Column(name="C_INDREPETICION")
    private String indiceRepeticion;
    
    @Column(name="C_ESTADOSEGUIMIENTO")
    private String estado;
            
    @Column(name="C_INDSELECCIONHORAINI")
    private Boolean indicadorSeleccionHoraIni;
    
    @Column(name="C_INDSELECCIONHORAFIN")
    private Boolean indicadorSeleccionHoraFin;
    
    @Column(name="C_DESTINAOPCIONALES")
    private String opcionales;
    
    @Transient
    private Date inicio;
    
    @Transient
    private Date fin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getInicioSeguimiento() {
        return inicioSeguimiento;
    }

    public void setInicioSeguimiento(Date inicioSeguimiento) {
        this.inicioSeguimiento = inicioSeguimiento;
    }

    public Date getFinSeguimiento() {
        return finSeguimiento;
    }

    public void setFinSeguimiento(Date finSeguimiento) {
        this.finSeguimiento = finSeguimiento;
    }

    public String getTipoTiempoIni() {
        return tipoTiempoIni;
    }

    public void setTipoTiempoIni(String tipoTiempoIni) {
        this.tipoTiempoIni = tipoTiempoIni;
    }

    public String getTipoTiempoFin() {
        return tipoTiempoFin;
    }

    public void setTipoTiempoFin(String tipoTiempoFin) {
        this.tipoTiempoFin = tipoTiempoFin;
    }

    public Integer getNumeroInicial() {
        return numeroInicial;
    }

    public void setNumeroInicial(Integer numeroInicial) {
        this.numeroInicial = numeroInicial;
    }

    public Integer getNumeroFinal() {
        return numeroFinal;
    }

    public void setNumeroFinal(Integer numeroFinal) {
        this.numeroFinal = numeroFinal;
    }

    public String getIndicadorAntesDespuesIni() {
        return indicadorAntesDespuesIni;
    }

    public void setIndicadorAntesDespuesIni(String indicadorAntesDespuesIni) {
        this.indicadorAntesDespuesIni = indicadorAntesDespuesIni;
    }

    public String getIndicadorAntesDespuesFin() {
        return indicadorAntesDespuesFin;
    }

    public void setIndicadorAntesDespuesFin(String indicadorAntesDespuesFin) {
        this.indicadorAntesDespuesFin = indicadorAntesDespuesFin;
    }

    public Date getInicioDefinitivo() {
        return inicioDefinitivo;
    }

    public void setInicioDefinitivo(Date inicioDefinitivo) {
        this.inicioDefinitivo = inicioDefinitivo;
    }

    public Date getFinDefinitivo() {
        return finDefinitivo;
    }

    public void setFinDefinitivo(Date finDefinitivo) {
        this.finDefinitivo = finDefinitivo;
    }

    public String getIndicadorLunesViernes() {
        return indicadorLunesViernes;
    }

    public void setIndicadorLunesViernes(String indicadorLunesViernes) {
        this.indicadorLunesViernes = indicadorLunesViernes;
    }

    public Date getUltimaEjecucion() {
        return ultimaEjecucion;
    }

    public void setUltimaEjecucion(Date ultimaEjecucion) {
        this.ultimaEjecucion = ultimaEjecucion;
    }

    public String getIndiceRepeticion() {
        return indiceRepeticion;
    }

    public void setIndiceRepeticion(String indiceRepeticion) {
        this.indiceRepeticion = indiceRepeticion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean isIndicadorSeleccionHoraIni() {
        return indicadorSeleccionHoraIni;
    }

    public void setIndicadorSeleccionHoraIni(Boolean indicadorSeleccionHoraIni) {
        this.indicadorSeleccionHoraIni = indicadorSeleccionHoraIni;
    }

    public Boolean isIndicadorSeleccionHoraFin() {
        return indicadorSeleccionHoraFin;
    }

    public void setIndicadorSeleccionHoraFin(Boolean indicadorSeleccionHoraFin) {
        this.indicadorSeleccionHoraFin = indicadorSeleccionHoraFin;
    }

    public String getOpcionales() {
        return opcionales;
    }

    public void setOpcionales(String opcionales) {
        this.opcionales = opcionales;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

}
