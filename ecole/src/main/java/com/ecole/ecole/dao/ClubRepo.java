package com.ecole.ecole.dao;

import com.ecole.ecole.Models.Club;
import com.ecole.ecole.Models.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepo extends JpaRepository<Club,Long> {
    void deleteClubById(Long id);
}
