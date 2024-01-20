package com.ecole.ecole.Service;

import com.ecole.ecole.DTOs.ClasseDTO;
import com.ecole.ecole.DTOs.EtudiantDTO;
import com.ecole.ecole.Models.Classe;
import com.ecole.ecole.Models.Club;
import com.ecole.ecole.dao.ClassRepo;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClasseService {
    @Autowired
    ClassRepo classRepo;
    @Autowired
    Mapper modelMapper;

    public ClasseService() {}
  //  public List<Classe> getAllClasses(){return classRepo.findAll();}
    public Classe addClass(Classe classe){
        return classRepo.save(classe);
    }
    public Classe updateClass(Classe classe){
        return classRepo.save(classe);
    }
    public void deleteClass(Long id){
        classRepo.deleteClasseById(id);
    }
    public List<ClasseDTO> getAllClass(){
        List<ClasseDTO> classeDTOList = classRepo.findAll().stream()
                .map(classe -> modelMapper.map(classe, ClasseDTO.class))
                .collect(Collectors.toList());
        return classeDTOList;
    }
}
