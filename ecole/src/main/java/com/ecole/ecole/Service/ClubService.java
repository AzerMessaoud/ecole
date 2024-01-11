package com.ecole.ecole.Service;

import com.ecole.ecole.Models.Club;
import com.ecole.ecole.dao.ClubRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {
    @Autowired
    ClubRepo clubRepo;

    public ClubService() {}
    public List<Club> getAllClubs(){return clubRepo.findAll();}
    public Club addClub(Club club){
        return clubRepo.save(club);
    }
    public Club updateClub(Club club){
        return clubRepo.save(club);
    }
    public void deleteClub(Long id){
        clubRepo.deleteClubById(id);
    }

}
