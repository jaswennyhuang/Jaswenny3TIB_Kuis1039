/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1039.kuis_1039.controller;
import com.kuis_1039.kuis_1039.entity.Aksesoris;
import com.kuis_1039.kuis_1039.service.AksesorisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author PC320-04
 */
@RestController
@RequestMapping("/aksesoris_1039")
public class AksesorisController {
    @Autowired
    private AksesorisService categoryService;

    @RequestMapping(method = RequestMethod.POST)
    public Aksesoris insert(@RequestBody Aksesoris category) {
        return categoryService.insert(category);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Aksesoris update(@RequestBody Aksesoris category) {
        return categoryService.update(category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_aksesoris}")
    public boolean delete(@PathVariable("id_aksesoris") String id_aksesoris) {
        return categoryService.delete(id_aksesoris);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_aksesoris}")
    public Aksesoris getById(@PathVariable("id_aksesoris") String id_aksesoris){
        return categoryService.getByUsername(id_aksesoris);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Aksesoris> getAll(){
        return categoryService.getAll();
    }
    
}
