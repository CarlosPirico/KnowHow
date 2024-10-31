package com.knowhow.controller;

import com.knowhow.model.LevelSystem;
import com.knowhow.service.LevelSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/level-system")
public class LevelSystemController {
    private final LevelSystemService levelSystemService;

    @Autowired
    public LevelSystemController(LevelSystemService levelSystemService) {
        this.levelSystemService = levelSystemService;
    }

    @GetMapping()
    public List<LevelSystem> listarLevelSystems() {
        return levelSystemService.listarLevelSystems();
    }
    
    @GetMapping(path="/{level}", produces = "application/json")
    public Optional<LevelSystem> listarLevelSystemPorId(@PathVariable("level") Integer level) {
        return levelSystemService.listarLevelSystemPorId(level);
    }

    @PostMapping()
    public LevelSystem criarLevelSystem(@RequestBody LevelSystem levelSystem) {
        return levelSystemService.salvarLevelSystem(levelSystem);
    }
}
