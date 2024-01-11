package com.ecole.ecole.dao;

import com.ecole.ecole.Models.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepo extends JpaRepository<Classe,Long> {
    void deleteClasseById(Long id);
}
