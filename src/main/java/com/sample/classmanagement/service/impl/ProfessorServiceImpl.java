package com.sample.classmanagement.service.impl;

import com.sample.classmanagement.entity.ProfessorEntity;
import com.sample.classmanagement.repository.ProfessorRepository;
import com.sample.classmanagement.service.ProfessorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorServiceImpl implements ProfessorService {
    private final ProfessorRepository professorRepository;

    public ProfessorServiceImpl(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @Override
    public ProfessorEntity addProfessor(ProfessorEntity professorEntity) {
        return professorRepository.save(professorEntity);
    }

    @Override
    public List<ProfessorEntity> findAllProfessors() {
        return professorRepository.findAll();
    }

    @Override
    public Optional<ProfessorEntity> findProfessorById(Integer id) {
        return professorRepository.findById(id);
    }

    @Override
    public ProfessorEntity updateProfessor(ProfessorEntity professorEntity) {
        return professorRepository.save(professorEntity);
    }

    @Override
    public void removeProfessorById(Integer id) {
        Optional<ProfessorEntity> professorEntities = professorRepository.findById(id);
        ProfessorEntity professorEntity = professorEntities.orElse(null);
        if (professorEntity == null) return;
        professorEntity.setDeleted(Boolean.TRUE);
        professorRepository.save(professorEntity);
    }
}
