package org.sid.controllers;

import org.sid.dao.EnvoieRepository;
import org.sid.entities.Envoie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin (maxAge = 3600)
@RestController
@RequestMapping("/api")
public class EnvoieController {
    @Autowired
    private EnvoieRepository envoieRepository;

    @RequestMapping("/envoies")
    public List<Envoie> getEnvoies(){
        return envoieRepository.findAll();
    }

    @PostMapping("/envoie")
    public Envoie save(@RequestBody Envoie envoie){
        return envoieRepository.save(envoie);
    }
}
