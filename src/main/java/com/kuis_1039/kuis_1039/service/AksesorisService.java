/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1039.kuis_1039.service;
import com.kuis_1039.kuis_1039.entity.Aksesoris;
import com.kuis_1039.kuis_1039.repo.AksesorisRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC320-04
 */
@Service("aksesorisService")
@Transactional
public class AksesorisService {
     @Autowired
    private AksesorisRepo repo;

    public Aksesoris insert(Aksesoris admin) {
        return repo.save(admin);
    }
    
    public Aksesoris update(Aksesoris admin) {
        return repo.save(admin);
    }
    
    public boolean delete(String id_aksesoris){
        repo.delete(id_aksesoris);
        return true;
    }
    
    public Aksesoris getByUsername(String id_aksesoris){
        return repo.findOne(id_aksesoris);
    }
    
    public List<Aksesoris> getAll(){
        return repo.findAllAksesoris();
    }
    
    
}
