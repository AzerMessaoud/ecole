package com.ecole.ecole.Service;

import com.ecole.ecole.Models.Classe;
import com.ecole.ecole.Models.Club;
import com.ecole.ecole.dao.ClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasseService {
    @Autowired
    ClassRepo classRepo;

    public ClasseService() {}
    public List<Classe> getAllClass(){return classRepo.findAll();}
    public Classe addClass(Classe classe){
        return classRepo.save(classe);
    }
    public Classe updateClass(Classe classe){
        return classRepo.save(classe);
    }
    public void deleteClass(Long id){
        classRepo.deleteClasseById(id);
    }
}
