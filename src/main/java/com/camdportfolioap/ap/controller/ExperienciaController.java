package com.camdportfolioap.ap.controller;


import com.camdportfolioap.ap.models.Experiencia;
import com.camdportfolioap.ap.services.ExperienciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {
    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    @GetMapping("/allExp")
    public ResponseEntity<List<Experiencia>> obtenerExperiencia(){
        List<Experiencia> experiencias=experienciaService.buscarExp();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }

    @PutMapping("/updateExp")
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
        Experiencia updateExperiencia=experienciaService.editarExp(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }

    @PostMapping("/addExp")
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia) {
        Experiencia nuevaExperiencia=experienciaService.addExp(experiencia);
        return new ResponseEntity<>(nuevaExperiencia, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteExp/{id}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable("id") Long id) {
        experienciaService.borrarExp(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
