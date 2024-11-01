package com.knowhow.service;

import com.knowhow.model.Subject;
import com.knowhow.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {
    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> listarSubjects() {
        return subjectRepository.findAll();
    }
    
    public Optional<Subject> listarSubjectsPorId(Long id) {
        return subjectRepository.findById(id);
    }

    public Subject salvarSubject(Subject subject) {
        return subjectRepository.save(subject);
    }
}
