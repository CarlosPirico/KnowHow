package com.knowhow.service;

import com.knowhow.model.Exercise;
import com.knowhow.repository.ExerciseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseService {
    private final ExerciseRepository exerciseRepository;

    public ExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    public List<Exercise> listarExercises() {
        return exerciseRepository.findAll();
    }
    
    public Optional<Exercise> listarExercisePorId(Integer id) {
        return exerciseRepository.findById(id);
    }

    public Exercise salvarExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }
}
