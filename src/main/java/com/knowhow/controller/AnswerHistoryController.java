package com.knowhow.controller;

import com.knowhow.model.AnswerHistory;
import com.knowhow.service.AnswerHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/answer-history")
public class AnswerHistoryController {
    private final AnswerHistoryService answerHistoryService;

    @Autowired
    public AnswerHistoryController(AnswerHistoryService answerHistoryService) {
        this.answerHistoryService = answerHistoryService;
    }

    @GetMapping()
    public List<AnswerHistory> listarAnswerHistories() {
        return answerHistoryService.listarAnswerHistories();
    }
    
    @GetMapping(path="/{id}", produces = "application/json")
    public Optional<AnswerHistory> listarAnswerHistoryPorId(@PathVariable("id") Integer id) {
        return answerHistoryService.listarAnswerHistoryPorId(id);
    }

    @PostMapping()
    public AnswerHistory criarAnswerHistory(@RequestBody AnswerHistory answerHistory) {
        return answerHistoryService.salvarAnswerHistory(answerHistory);
    }
}
