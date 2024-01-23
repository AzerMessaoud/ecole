package com.ecole.ecole.dao;

import com.ecole.ecole.Models.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepo extends JpaRepository<Classe,Long> {
    void deleteClasseById(Long id);


@Query("SELECT c FROM Classe c " +
        "LEFT JOIN Etudiant e " +
        "ON c.id = e.classe.id " +
        "WHERE e.id IS NULL")
    List<Classe> findClassesWithoutStudents();


}
