package com.knowhow.repository;

import com.knowhow.model.AnswerHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerHistoryRepository extends JpaRepository<AnswerHistory, Integer> {
}
