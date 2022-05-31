package com.camdportfolioap.ap.services;

import com.camdportfolioap.ap.models.Experiencia;
import com.camdportfolioap.ap.repository.ExperienciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExperienciaService {
    private final ExperienciaRepo experienciaRepo;

    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }

    public Experiencia addExp(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    public List<Experiencia> buscarExp() {
        return experienciaRepo.findAll();
    }

    public Experiencia editarExp(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }

    public void borrarExp(Long id){
        experienciaRepo.deleteById(id);
    }
}
