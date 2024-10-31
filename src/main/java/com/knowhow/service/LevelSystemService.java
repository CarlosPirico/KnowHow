package com.knowhow.service;

import com.knowhow.model.LevelSystem;
import com.knowhow.repository.LevelSystemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LevelSystemService {
    private final LevelSystemRepository levelSystemRepository;

    public LevelSystemService(LevelSystemRepository levelSystemRepository) {
        this.levelSystemRepository = levelSystemRepository;
    }

    public List<LevelSystem> listarLevelSystems() {
        return levelSystemRepository.findAll();
    }
    
    public Optional<LevelSystem> listarLevelSystemPorId(Integer level) {
        return levelSystemRepository.findById(level);
    }

    public LevelSystem salvarLevelSystem(LevelSystem levelSystem) {
        return levelSystemRepository.save(levelSystem);
    }
}
