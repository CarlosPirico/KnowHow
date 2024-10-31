package com.knowhow.service;

import com.knowhow.model.Ranking;
import com.knowhow.repository.RankingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RankingService {
    
    private final RankingRepository rankingRepository;

    public RankingService(RankingRepository rankingRepository) {
        this.rankingRepository = rankingRepository;
    }

    public List<Ranking> listarRankings() {
        return rankingRepository.findAll();
    }

    public Optional<Ranking> listarRankingPorId(Integer id) {
        return rankingRepository.findById(id);
    }

    public Ranking salvarRanking(Ranking ranking) {
        return rankingRepository.save(ranking);
    }
}
