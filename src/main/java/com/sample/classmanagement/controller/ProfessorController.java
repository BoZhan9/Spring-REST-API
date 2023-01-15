package com.sample.classmanagement.controller;

import com.sample.classmanagement.entity.ProfessorEntity;
import com.sample.classmanagement.service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @PostMapping
    public ProfessorEntity addProfessor(@RequestBody ProfessorEntity professorEntity) {
        return professorService.addProfessor(professorEntity);
    }
    @GetMapping
    public List<ProfessorEntity> findAllProfessors(){
        return professorService.findAllProfessors();
    };
    @GetMapping("/{id}")
    public Optional<ProfessorEntity> findStudentById(@PathVariable("id") Integer id) {
        return professorService.findProfessorById(id);
    }

    @PutMapping
    public ProfessorEntity updateProfessor(@RequestBody ProfessorEntity professorEntity) {
        return professorService.updateProfessor(professorEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable("id") Integer id) {
        professorService.removeProfessorById(id);
    }
}
