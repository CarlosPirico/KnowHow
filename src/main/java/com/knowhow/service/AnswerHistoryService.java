package com.knowhow.service;

import com.knowhow.model.AnswerHistory;
import com.knowhow.repository.AnswerHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerHistoryService {
    private final AnswerHistoryRepository answerHistoryRepository;

    public AnswerHistoryService(AnswerHistoryRepository answerHistoryRepository) {
        this.answerHistoryRepository = answerHistoryRepository;
    }

    public List<AnswerHistory> listarAnswerHistories() {
        return answerHistoryRepository.findAll();
    }
    
    public Optional<AnswerHistory> listarAnswerHistoryPorId(Integer id) {
        return answerHistoryRepository.findById(id);
    }

    public AnswerHistory salvarAnswerHistory(AnswerHistory answerHistory) {
        return answerHistoryRepository.save(answerHistory);
    }
}
