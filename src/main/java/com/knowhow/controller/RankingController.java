package com.knowhow.controller;

import com.knowhow.model.Ranking;
import com.knowhow.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ranking")
public class RankingController {
    private final RankingService rankingService;

    @Autowired
    public RankingController(RankingService rankingService) {
        this.rankingService = rankingService;
    }

    @GetMapping()
    public List<Ranking> listarRankings() {
        return rankingService.listarRankings();
    }
    
    @GetMapping(path="/{id}", produces = "application/json")
    public Optional<Ranking> listarRankingPorId(@PathVariable("id") Integer id) {
        return rankingService.listarRankingPorId(id);
    }

    @PostMapping()
    public Ranking criarRanking(@RequestBody Ranking ranking) {
        return rankingService.salvarRanking(ranking);
    }
}
