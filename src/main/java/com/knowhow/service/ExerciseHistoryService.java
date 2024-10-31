package com.knowhow.service;

import com.knowhow.model.ExerciseHistory;
import com.knowhow.repository.ExerciseHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseHistoryService {
    private final ExerciseHistoryRepository exerciseHistoryRepository;

    public ExerciseHistoryService(ExerciseHistoryRepository exerciseHistoryRepository) {
        this.exerciseHistoryRepository = exerciseHistoryRepository;
    }

    public List<ExerciseHistory> listarExerciseHistories() {
        return exerciseHistoryRepository.findAll();
    }
    
    public Optional<ExerciseHistory> listarExerciseHistoryPorId(Integer id) {
        return exerciseHistoryRepository.findById(id);
    }

    public ExerciseHistory salvarExerciseHistory(ExerciseHistory exerciseHistory) {
        return exerciseHistoryRepository.save(exerciseHistory);
    }
}
