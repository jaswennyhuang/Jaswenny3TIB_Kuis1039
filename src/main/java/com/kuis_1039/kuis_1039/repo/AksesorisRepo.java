/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1039.kuis_1039.repo;
import com.kuis_1039.kuis_1039.entity.Aksesoris;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author PC320-04
 */
public interface AksesorisRepo extends CrudRepository<Aksesoris, String>  {
    @Query("select a from Aksesoris a")
    public List<Aksesoris> findAllAksesoris();
    
}
