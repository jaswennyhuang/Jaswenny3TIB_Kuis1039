/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1039.kuis_1039.repo;
import com.kuis_1039.kuis_1039.entity.Mobil;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
/**
 *
 * @author PC320-04
 */
public  interface MobilRepo extends CrudRepository<Mobil, String> {
     @Query("select a from Mobil a")
    public List<Mobil> findAllMobil();
    
}
