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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author carlos
 */
@Entity
@Table(name="SIMCO_SEG_ALERTA")
public class Alerta implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @SequenceGenerator(name="SEQ_SIMCO_SEG_ALERTA_GENERATOR", sequenceName="SEQ_SIMCO_SEG_ALERTA", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_SIMCO_SEG_ALERTA")
    @Column(name="N_ID_ALERTA")
    private Long id;

    @Column(name="C_DESCRIPALERTA")
    private String descripcion; 
    
    @Column(name="C_ESTADOALERTA")
    private String estado; 
            
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="D_FECHAENVIOALERTA")
    private Date fechaEnvio;        
    
    @ManyToOne
    @JoinColumn(name="N_ID_SEGUIEMIENTO")
    private SeguimientoAcuerdo seguimientoAcuerdo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public SeguimientoAcuerdo getSeguimientoAcuerdo() {
        return seguimientoAcuerdo;
    }

    public void setSeguimientoAcuerdo(SeguimientoAcuerdo seguimientoAcuerdo) {
        this.seguimientoAcuerdo = seguimientoAcuerdo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
