package com.knowhow.controller;

import com.knowhow.model.Exercise;
import com.knowhow.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {
    private final ExerciseService exerciseService;

    @Autowired
    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping()
    public List<Exercise> listarExercises() {
        return exerciseService.listarExercises();
    }
    
    @GetMapping(path="/{id}", produces = "application/json")
    public Optional<Exercise> listarExercisePorId(@PathVariable("id") Integer id) {
        return exerciseService.listarExercisePorId(id);
    }

    @PostMapping()
    public Exercise criarExercise(@RequestBody Exercise exercise) {
        return exerciseService.salvarExercise(exercise);
    }
}
