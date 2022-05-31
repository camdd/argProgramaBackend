package com.camdportfolioap.ap.controller;


import com.camdportfolioap.ap.models.Skills;
import com.camdportfolioap.ap.services.SkillsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class SkillsController {
    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @GetMapping("/allSkills")
    public ResponseEntity<List<Skills>> obtenerSkills() {
        List<Skills> skills = skillsService.buscarSkill();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @PutMapping("/updateSkill")
    public ResponseEntity<Skills> editarSkill(@RequestBody Skills skills) {
        Skills updateSkills = skillsService.editarSkill(skills);
        return new ResponseEntity<>(updateSkills, HttpStatus.OK);
    }

    @PostMapping("/addSkill")
    public ResponseEntity<Skills> crearSkill(@RequestBody Skills skills) {
        Skills nuevaSkill = skillsService.addSkill(skills);
        return new ResponseEntity<>(nuevaSkill, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteSkill/{id}")
    public ResponseEntity<?> borrarSkill(@PathVariable("id") Long id) {
        skillsService.borrarSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
