package com.ecole.ecole.dao;


import com.ecole.ecole.Models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant,Long> {
   void deleteEtudiantById(Long id);

   @Query("SELECT e FROM Etudiant e " +
           "JOIN e.classe c " +
           "JOIN c.niveau n " +
           "WHERE n.niveauLib  LIKE niveauLib")
   List<Etudiant> findByNiveau(@Param("niveauLib") String niveauLib);
   List<Etudiant> findByClasseIsNull();
   @Query("SELECT e FROM Etudiant  e " +
           "WHERE e.classe IS NULL")
   List<Etudiant> findStudentsWithoutClasses();



}
