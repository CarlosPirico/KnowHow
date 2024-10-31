package com.knowhow.repository;

import com.knowhow.model.ExerciseHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseHistoryRepository extends JpaRepository<ExerciseHistory, Integer> {
}
