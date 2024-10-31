package com.knowhow.controller;

import com.knowhow.model.ExerciseHistory;
import com.knowhow.service.ExerciseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/exercise-history")
public class ExerciseHistoryController {
    private final ExerciseHistoryService exerciseHistoryService;

    @Autowired
    public ExerciseHistoryController(ExerciseHistoryService exerciseHistoryService) {
        this.exerciseHistoryService = exerciseHistoryService;
    }

    @GetMapping()
    public List<ExerciseHistory> listarExerciseHistories() {
        return exerciseHistoryService.listarExerciseHistories();
    }
    
    @GetMapping(path="/{id}", produces = "application/json")
    public Optional<ExerciseHistory> listarExerciseHistoryPorId(@PathVariable("id") Integer id) {
        return exerciseHistoryService.listarExerciseHistoryPorId(id);
    }

    @PostMapping()
    public ExerciseHistory criarExerciseHistory(@RequestBody ExerciseHistory exerciseHistory) {
        return exerciseHistoryService.salvarExerciseHistory(exerciseHistory);
    }
}
