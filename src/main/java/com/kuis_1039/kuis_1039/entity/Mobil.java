/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1039.kuis_1039.entity;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author PC320-04
 */
@Entity
@Table(name = "mobil_1039")
public class Mobil implements Serializable {
      @Id
    @Column(length = 100, nullable = false, unique = true)
    private String id_mobil;
    @Column(length = 100, nullable = true)
    private String merk;
    @Column(length = 100, nullable = true)
    private String jenis;
    @Column(length = 100, nullable = true)
    private String warna;
    
    @OneToMany
    @JoinColumn(name="id_mobil")
    private Set<Aksesoris> id_aksesoris;
   
    
    
    public String getIdMobil() {
        return id_mobil;
    }

    /**
     * @param usernameadmin the name to set
     */
    public void setIdMobil(String id_mobil) {
        this.id_mobil = id_mobil;
    }

    /**
     * @return the description
     */
    public String getMerk() {
        return merk;
    }

    /**
     * @param passwordadmin the description to set
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public String getJenis() {
        return jenis;
    }

    /**
     * @param passwordadmin the description to set
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
     public String getWarna() {
        return warna;
    }

    /**
     * @param passwordadmin the description to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
}
