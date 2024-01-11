package com.ecole.ecole.Service;

import com.ecole.ecole.Models.Etudiant;
import com.ecole.ecole.Models.Niveau;
import com.ecole.ecole.dao.EtudiantRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {
    EtudiantRepo etudiantRepo;

    public EtudiantService() {}
    public List<Etudiant> getAllEtudiant(){return etudiantRepo.findAll();}
    public Etudiant addEtudiant(Etudiant etudiant){
        return etudiantRepo.save(etudiant);
    }
    public Etudiant updateEtudiant(Etudiant etudiant){
        return etudiantRepo.save(etudiant);
    }
    public void deleteEtudiant(Long id){etudiantRepo.deleteEtudiantById(id);}
}
