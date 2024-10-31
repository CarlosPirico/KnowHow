package com.knowhow.repository;

import com.knowhow.model.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; //Porque não consigo deixar que nem subjectRepositorio que não tem esses imports?

@Repository
public interface RankingRepository extends JpaRepository<Ranking, Integer> {
}
