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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author carlos
 */
@Entity
@Table(name="SIMCO_NOTICIAS_RSS")
public class Noticia implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @SequenceGenerator(name="SEQ_SIMCO_NOTICIAS_RSS", sequenceName="SEQ_SIMCO_NOTICIAS_RSS", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_SIMCO_NOTICIAS_RSS")
    @Column(name="N_ID_NOTICIAS")
    private Long id;
    
    @Column(name="C_LINK")
    private String link; 
    
    @Column(name="C_DESCRIPCION")
    private String descripcion; 
    
    @Column(name="C_EMPRESA")
    private String empresa; 
    
    @Column(name="C_FECHAPUB")
    private String fechaPublica; 
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="D_FECREGISTRO")
    private Date fechaRegistro; 
    
    @Column(name="C_TITULO")
    private String titulo; 
    
    @Column(name="C_REGION")
    private String region; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFechaPublica() {
        return fechaPublica;
    }

    public void setFechaPublica(String fechaPublica) {
        this.fechaPublica = fechaPublica;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
}
