package com.knowhow.controller;

import com.knowhow.model.Question;
import com.knowhow.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping()
    public List<Question> listarQuestions() {
        return questionService.listarQuestions();
    }
    
    @GetMapping(path="/{id}", produces = "application/json")
    public Optional<Question> listarQuestionPorId(@PathVariable("id") Integer id) {
        return questionService.listarQuestionPorId(id);
    }

    @PostMapping()
    public Question criarQuestion(@RequestBody Question question) {
        return questionService.salvarQuestion(question);
    }
}
