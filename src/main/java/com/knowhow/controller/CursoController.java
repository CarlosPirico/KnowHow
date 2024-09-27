package com.knowhow.controller;

import com.knowhow.model.Curso;
import com.knowhow.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CursoController {
    private final CursoService cursoService;

    @Autowired
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/cursos")
    public List<Curso> listarCursos() {
        return cursoService.listarCursos();
    }

    @PostMapping("/cursos")
    public Curso criarCurso(@RequestBody Curso curso) {
        return cursoService.salvarCurso(curso);
    }
}
