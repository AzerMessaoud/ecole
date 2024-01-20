package com.ecole.ecole.access;

import com.ecole.ecole.DTOs.ClasseDTO;
import com.ecole.ecole.Models.Classe;
import com.ecole.ecole.Models.Club;
import com.ecole.ecole.Service.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classe")
public class Classecontroller {
    @Autowired
    ClasseService classeService;

    @GetMapping
    public ResponseEntity<List<ClasseDTO>> getAllClasses() {
        List<ClasseDTO> classes = classeService.getAllClass();
        return new ResponseEntity<>(classes, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Classe> addClasses(@RequestBody Classe classe){
        Classe newClasse = classeService.addClass(classe);
        return new ResponseEntity<>(newClasse, HttpStatus.CREATED);
    }
    @PostMapping("/Update")
    public ResponseEntity<Classe> updateClasses(@RequestBody Classe classe){
        Classe UpdatedClasse= classeService.updateClass(classe);
        return new ResponseEntity<>(UpdatedClasse, HttpStatus.OK);
    }
    @DeleteMapping("/Delete{id}")
    public ResponseEntity<?>deleteClasses(@PathVariable("id") Long id) {
        classeService.deleteClass(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
