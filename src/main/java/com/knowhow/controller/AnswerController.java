package com.knowhow.controller;

import com.knowhow.model.Answer;
import com.knowhow.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/answers")
public class AnswerController {
    private final AnswerService answerService;

    @Autowired
    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping()
    public List<Answer> listarAnswers() {
        return answerService.listarAnswers();
    }

    @GetMapping(path="/{id}", produces = "application/json")
    public Optional<Answer> listarAnswerPorId(@PathVariable("id") Integer id) {
        return answerService.listarAnswerPorId(id);
    }

    @PostMapping()
    public Answer criarAnswer(@RequestBody Answer answer) {
        return answerService.salvarAnswer(answer);
    }
}
