package com.knowhow.service;

import com.knowhow.model.Question;
import com.knowhow.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> listarQuestions() {
        return questionRepository.findAll();
    }
    
    public Optional<Question> listarQuestionPorId(Integer id) {
        return questionRepository.findById(id);
    }

    public Question salvarQuestion(Question question) {
        return questionRepository.save(question);
    }
}
