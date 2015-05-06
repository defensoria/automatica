/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.simco.defensoria.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author carlos
 */
@Entity
@Table(name="SIMCO_NOTICIAS_CANALES")
public class Canal implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="N_ID_CANALES")
    private Long id;
    
    @Column(name="C_NOMBRE")
    private String nombre;         
            
    @Column(name="C_RSS")
    private String rss;           
            
    @Column(name="C_REGION")
    private String region;                 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRss() {
        return rss;
    }

    public void setRss(String rss) {
        this.rss = rss;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
                    
    
}
