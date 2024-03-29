package com.ecole.ecole.access;
import com.ecole.ecole.Models.Etudiant;
import com.ecole.ecole.DTOs.EtudiantDTO;
import com.ecole.ecole.Service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
    @Autowired
    EtudiantService etudiantService;

    @GetMapping
    public ResponseEntity<List<EtudiantDTO>> getAllEtudiants() {
        List<EtudiantDTO> etudiants = etudiantService.getAllEtudiant();
        return new ResponseEntity<>(etudiants, HttpStatus.OK);
    }
    @GetMapping("/derived-query")
    public ResponseEntity<List<EtudiantDTO>> getAllEtudiantsDQ() {
        List<EtudiantDTO> etudiants = etudiantService.getStudentsWithoutClassesDQ();
        return new ResponseEntity<>(etudiants, HttpStatus.OK);
    }@GetMapping("/jpql")
    public ResponseEntity<List<EtudiantDTO>> getStudentsWithoutClasses() {
        List<EtudiantDTO> etudiants = etudiantService.getStudentsWithoutClasses();
        return new ResponseEntity<>(etudiants, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Etudiant> addEtudiants(@RequestBody Etudiant etudiant){
        Etudiant newEtudiant = etudiantService.addEtudiant(etudiant);
        return new ResponseEntity<>(newEtudiant, HttpStatus.CREATED);
    }
    @PostMapping("/update")
    public ResponseEntity<Etudiant> updateClasses(@RequestBody Etudiant etudiant){
        Etudiant UpdatedEtudiant= etudiantService.updateEtudiant(etudiant);
        return new ResponseEntity<>(UpdatedEtudiant, HttpStatus.OK);
    }
    @DeleteMapping("/delete{id}")
    public ResponseEntity<?>deleteEtudiant(@PathVariable("id") Long id) {
        etudiantService.deleteEtudiant(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping("/{idEtudiant}/club/{idClub}")
    public ResponseEntity<String> affectingEtudiantToClub(
            @PathVariable("idEtudiant") Long idEtudiant,
            @PathVariable("idClub") Long idClub
    ) {
            etudiantService.affectationEtudiantClub(idEtudiant, idClub);
            return new ResponseEntity<>("Enrollment successful", HttpStatus.OK);
    }

    @GetMapping("/grade/{niveauLib}")
    public ResponseEntity<List<EtudiantDTO>> getAllFirstGradeEtudiants(@PathVariable ("niveauLib")String niveauLib) {
        List<EtudiantDTO> etudiants = etudiantService.getAllByNiveau(niveauLib);
        return new ResponseEntity<>(etudiants, HttpStatus.OK);
    }

}
