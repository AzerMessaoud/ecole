package com.ecole.ecole.dao;

import com.ecole.ecole.Models.Classe;
import com.ecole.ecole.Models.Niveau;
import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NiveauRepo extends JpaRepository<Niveau,Long> {
    void deleteNiveauById(Long id);
/*
    @Query("SELECT COUNT(n.id) as nb, n.niveauLib FROM Niveau n" +
            "JOIN Classe c" +
            "ON n.id = c.niveau.id " +
            "GROUP BY n.niveauLib" +
            "ORDER BY nb DESC")
    List<Classe> findNiveauWithMaxClasses();

 */
    @Query("SELECT new com.ecole.ecole.dao.RetourQuery ( COUNT(c) ,n.id ) FROM Classe c " +
            "JOIN Niveau n " +
            "ON n.id = c.niveau.id " +
            "GROUP BY n.id " )
    List<RetourQuery> findNiveauWithMaxClasses();





}
