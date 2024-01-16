package com.ecole.ecole.Service;

import com.ecole.ecole.Models.Club;
import com.ecole.ecole.Models.Etudiant;
import com.ecole.ecole.Models.Niveau;
import com.ecole.ecole.dao.ClubRepo;
import com.ecole.ecole.dao.EtudiantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {
    @Autowired
    EtudiantRepo etudiantRepo;
    @Autowired
    ClubRepo clubRepo;

    public EtudiantService() {}
    public List<Etudiant> getAllEtudiant(){ return etudiantRepo.findAll();

    }
    public Etudiant addEtudiant(Etudiant etudiant){
        return etudiantRepo.save(etudiant);
    }
    public Etudiant updateEtudiant(Etudiant etudiant){
        return etudiantRepo.save(etudiant);
    }
    public void deleteEtudiant(Long id){etudiantRepo.deleteEtudiantById(id);}
    public void affectationEtudiantClub(Long idEtudiant, Long idClub) {
        /*
        Optional<Etudiant> studentOptional = etudiantRepo.findById(idEtudiant);
        Optional<Club> courseOptional = clubRepo.findById(idClub);
        Etudiant etudiant = studentOptional.orElse(null);
        Club club = courseOptional.get();
        etudiant.getClubsAffecter().add(club);
        etudiantRepo.save(etudiant);

         */
    }
}
