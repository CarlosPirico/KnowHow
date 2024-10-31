package com.knowhow.service;

import com.knowhow.model.Answer;
import com.knowhow.repository.AnswerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerService {
    
    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public List<Answer> listarAnswers() {
        return answerRepository.findAll();
    }

    public Optional<Answer> listarAnswerPorId(Integer id) {
        return answerRepository.findById(id);
    }

    public Answer salvarAnswer(Answer answer) {
        return answerRepository.save(answer);
    }
}
