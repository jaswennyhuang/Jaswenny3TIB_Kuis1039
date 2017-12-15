/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1039.kuis_1039.service;
import com.kuis_1039.kuis_1039.entity.Mobil;
import com.kuis_1039.kuis_1039.repo.MobilRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC320-04
 */
@Service("mobilService")
@Transactional
public class MobilService {
   
     @Autowired
    private MobilRepo repo;

    public Mobil insert(Mobil admin) {
        return repo.save(admin);
    }
    
    public Mobil update(Mobil admin) {
        return repo.save(admin);
    }
    
    public boolean delete(String id_mobil){
        repo.delete(id_mobil);
        return true;
    }
    
    public Mobil getByUsername(String id_mobil){
        return repo.findOne(id_mobil);
    }
    
    public List<Mobil> getAll(){
        return repo.findAllMobil();
    }
    
    
}
