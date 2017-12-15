/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1039.kuis_1039.controller;
import com.kuis_1039.kuis_1039.entity.Mobil;
import com.kuis_1039.kuis_1039.service.MobilService;
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
@RequestMapping("/mobil_1039")
public class MobilController {
     @Autowired
    private MobilService categoryService;

    @RequestMapping(method = RequestMethod.POST)
    public Mobil insert(@RequestBody Mobil category) {
        return categoryService.insert(category);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Mobil update(@RequestBody Mobil category) {
        return categoryService.update(category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_mobil}")
    public boolean delete(@PathVariable("id_mobil") String id_mobil) {
        return categoryService.delete(id_mobil);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_mobil}")
    public Mobil getById(@PathVariable("id_mobil") String id_mobil){
        return categoryService.getByUsername(id_mobil);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Mobil> getAll(){
        return categoryService.getAll();
    }
    
}
