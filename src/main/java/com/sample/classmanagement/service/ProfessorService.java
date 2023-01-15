package com.sample.classmanagement.service;

import com.sample.classmanagement.entity.ProfessorEntity;
import com.sample.classmanagement.entity.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface ProfessorService {

    ProfessorEntity addProfessor(ProfessorEntity professorEntity); // create
    List<ProfessorEntity > findAllProfessors(); // read
    Optional<ProfessorEntity > findProfessorById(Integer id); // read
    ProfessorEntity  updateProfessor(ProfessorEntity professorEntity); // update
    void removeProfessorById(Integer id); // delete
}
