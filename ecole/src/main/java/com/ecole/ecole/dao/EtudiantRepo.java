package com.ecole.ecole.dao;

import com.ecole.ecole.Models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant,Long> {
   void deleteEtudiantById(Long id);
}
