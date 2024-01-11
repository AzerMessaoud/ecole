package com.ecole.ecole.Service;

import com.ecole.ecole.Models.Niveau;
import com.ecole.ecole.dao.NiveauRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NiveauService {
    @Autowired
    NiveauRepo niveauRepo;

    public NiveauService() {}
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
