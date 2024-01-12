package com.ecole.ecole.access;

import com.ecole.ecole.Models.Classe;
import com.ecole.ecole.Models.Niveau;
import com.ecole.ecole.Service.NiveauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/niveu")
public class NivaeuController {
    @Autowired
    NiveauService niveauService;

    @GetMapping
    public ResponseEntity<List<Niveau>> getAllNiveau() {
        List<Niveau> niveau = niveauService.getAllNiveau();
        return new ResponseEntity<>(niveau, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Niveau> addClasses(@RequestBody Niveau niveau){
        Niveau newNiveau = niveauService.addNiveau(niveau);
        return new ResponseEntity<>(newNiveau, HttpStatus.CREATED);
    }
    @PostMapping("/Update")
    public ResponseEntity<Niveau> updateNiveau(@RequestBody Niveau niveau){
        Niveau UpdatedNiveau= niveauService.updateNiveau(niveau);
        return new ResponseEntity<>(UpdatedNiveau, HttpStatus.OK);
    }
    @DeleteMapping("/Delete{id}")
    public ResponseEntity<?>deleteNiveaus(@PathVariable("id") Long id) {
        niveauService.deleteNiveau(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}