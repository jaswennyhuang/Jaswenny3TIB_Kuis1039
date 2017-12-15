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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author PC320-04
 */
@Entity
@Table(name = "aksesoris_1039")
public class Aksesoris implements Serializable {
    @Id
  
    @Column(length = 100, nullable = false, unique = true)
    private String id_aksesoris;
    @Column(length = 100, nullable = true)
    //private String id_mobil;
    //@Column(length = 100, nullable = true)
    private String nama;
    @Column(length = 100, nullable = true)
    private String warna;
    
   
     public String getIdAksesoris() {
        return id_aksesoris;
    }

    /**
     * @param usernameadmin the name to set
     */
    public void setIdAksesoris(String id_aksesoris) {
        this.id_aksesoris = id_aksesoris;
    }
    
    /*public String getIdMobil() {
        return id_mobil;
    }

    
    public void setIdMobil(String id_mobil) {
        this.id_mobil = id_mobil;
    } 

    /**
     * @return the description
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param passwordadmin the description to set
     */
    public void setNama(String nama) {
        this.nama = nama;
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
