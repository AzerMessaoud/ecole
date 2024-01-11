package com.ecole.ecole.access;

import com.ecole.ecole.Models.Club;
import com.ecole.ecole.Service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/club")
public class ClubController {
    @Autowired
    ClubService clubService;
    @GetMapping
    public ResponseEntity<List<Club>> getAllClubs() {
        List<Club> clubs = clubService.getAllClubs();
        return new ResponseEntity<>(clubs, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Club> addClub(@RequestBody Club club){
        Club newClubs = clubService.addClub(club);
        return new ResponseEntity<>(newClubs, HttpStatus.CREATED);
    }
    @PostMapping("/Update")
    public ResponseEntity<Club> updateClub(@RequestBody Club club){
        Club UpdatedClub= clubService.updateClub(club);
        return new ResponseEntity<>(UpdatedClub, HttpStatus.OK);
    }
    @DeleteMapping("/Delete{id}")
    public ResponseEntity<?>deleteClub(@PathVariable("id") Long id) {
        clubService.deleteClub(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    /*
    @GetMapping("/findById/{id}")
    public ResponseEntity<Club>getClublById(@PathVariable("id") Long id){
        Club clubs = clubService.getClubById(id);
        return new ResponseEntity<>(clubs, HttpStatus.OK);
    }

     */
}
