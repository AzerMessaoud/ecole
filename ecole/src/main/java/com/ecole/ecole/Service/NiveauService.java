package com.ecole.ecole.Service;

import com.ecole.ecole.DTOs.ClasseDTO;
import com.ecole.ecole.DTOs.NiveauDTO;
import com.ecole.ecole.Models.Niveau;
import com.ecole.ecole.dao.NiveauRepo;
import com.ecole.ecole.dao.RetourQuery;
import jakarta.persistence.Tuple;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NiveauService {
    @Autowired
    NiveauRepo niveauRepo;
    @Autowired
    Mapper modelMapper;

    public NiveauService() {}

    public List<RetourQuery> getNiveauWithMaxClasses() {
        return     niveauRepo.findNiveauWithMaxClasses();


    }



    public List<Niveau> getAllNiveau(){return niveauRepo.findAll();}
    public Niveau addNiveau(Niveau niveau){
        return niveauRepo.save(niveau);
    }
    public Niveau updateNiveau(Niveau niveau){
        return niveauRepo.save(niveau);
    }
    public void deleteNiveau(Long id){
        niveauRepo.deleteNiveauById(id);
    }

}
