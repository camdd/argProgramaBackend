package com.camdportfolioap.ap.services;

import com.camdportfolioap.ap.models.Skills;
import com.camdportfolioap.ap.models.Usuario;
import com.camdportfolioap.ap.repository.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillsService {
    private final SkillsRepo skillsRepo;

    @Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }

    public Skills addSkill(Skills skill) {
        return skillsRepo.save(skill);
    }

    public List<Skills> buscarSkill() {
        return skillsRepo.findAll();
    }

    public Skills editarSkill(Skills skill){
        return skillsRepo.save(skill);
    }

    public void borrarSkill(Long id){
        skillsRepo.deleteById(id);
    }
}
