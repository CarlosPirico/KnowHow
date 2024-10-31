package com.knowhow.repository;

import com.knowhow.model.LevelSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelSystemRepository extends JpaRepository<LevelSystem, Integer> {
}
