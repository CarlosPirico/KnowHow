package com.knowhow.service;

import com.knowhow.model.Curso;
import com.knowhow.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    public Curso salvarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }
}
