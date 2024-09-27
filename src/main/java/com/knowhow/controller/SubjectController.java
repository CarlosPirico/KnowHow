package com.knowhow.controller;

import com.knowhow.model.Subject;
import com.knowhow.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {
    private final SubjectService subjectService;

    @Autowired
    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping("/subjects")
    public List<Subject> listarSubjects() {
        return subjectService.listarSubjects();
    }

    @PostMapping("/subjects")
    public Subject criarSubject(@RequestBody Subject subject) {
        return subjectService.salvarSubject(subject);
    }
}
