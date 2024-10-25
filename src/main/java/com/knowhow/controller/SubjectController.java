package com.knowhow.controller;

import com.knowhow.model.Subject;
import com.knowhow.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
    private final SubjectService subjectService;

    @Autowired
    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping()
    public List<Subject> listarSubjects() {
        return subjectService.listarSubjects();
    }
    
    @GetMapping(path="/{id}", produces = "application/json")
    public Optional<Subject> listarSubjectsPorId(@PathVariable("id") Long id) {
        return subjectService.listarSubjectsPorId(id);
    }

    @PostMapping()
    public Subject criarSubject(@RequestBody Subject subject) {
        return subjectService.salvarSubject(subject);
    }
}
