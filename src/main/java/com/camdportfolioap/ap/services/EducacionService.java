package com.camdportfolioap.ap.services;

import com.camdportfolioap.ap.models.Educacion;
import com.camdportfolioap.ap.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    public Educacion addEducation(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public List<Educacion> buscarEducaciones() {
        return educacionRepo.findAll();
    }

    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }

    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }
}
