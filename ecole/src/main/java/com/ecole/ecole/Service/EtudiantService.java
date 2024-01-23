package com.ecole.ecole.Service;

import com.ecole.ecole.Models.Etudiant;
import com.ecole.ecole.DTOs.EtudiantDTO;
import com.ecole.ecole.dao.ClubRepo;
import com.ecole.ecole.dao.EtudiantRepo;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EtudiantService {
    @Autowired
    EtudiantRepo etudiantRepo;
    @Autowired
    ClubRepo clubRepo;
    @Autowired
    Mapper modelMapper;


    public EtudiantService() {}
    public List<EtudiantDTO> getAllEtudiant(){
        List<EtudiantDTO> etudiantDTOList = etudiantRepo.findAll().stream()
            .map(etudiant -> modelMapper.map(etudiant, EtudiantDTO.class))
            .collect(Collectors.toList());
        return etudiantDTOList;
    }
    public List<EtudiantDTO> getAllByNiveau(String NiveauLib){
        List<EtudiantDTO> etudiantDTOList = etudiantRepo.findByNiveau(NiveauLib).stream()
                .map(etudiant -> modelMapper.map(etudiant, EtudiantDTO.class))
                .collect(Collectors.toList());
        return etudiantDTOList;
    }
    public List<EtudiantDTO> getStudentsWithoutClassesDQ(){
        List<EtudiantDTO> etudiantDTOList = etudiantRepo.findByClasseIsNull().stream()
                .map(etudiant -> modelMapper.map(etudiant, EtudiantDTO.class))
                .collect(Collectors.toList());
        return etudiantDTOList;
    }
    public List<EtudiantDTO> getStudentsWithoutClasses(){
        List<EtudiantDTO> etudiantDTOList = etudiantRepo.findStudentsWithoutClasses().stream()
                .map(etudiant -> modelMapper.map(etudiant, EtudiantDTO.class))
                .collect(Collectors.toList());
        return etudiantDTOList;
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
