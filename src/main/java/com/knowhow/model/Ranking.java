package com.knowhow.model;

// Importações para mapeamento objeto-relacional
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;


@Entity
public class Ranking {

    // Configurando colunas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "rank_position", nullable = false)
    private Integer rankPosition;

    @Column(name = "total_points", nullable = false)
    private Integer totalPoints;

    // Construtor padrão JPA
    public Ranking() {}

    // Construtor dos atributos da classe
    public Ranking(Integer userId, Integer rankPosition, Integer totalPoints) {
        this.userId = userId;
        this.rankPosition = rankPosition;
        this.totalPoints = totalPoints;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRankPosition() {
        return rankPosition;
    }

    public void setRankPosition(Integer rankPosition) {
        this.rankPosition = rankPosition;
    }

    public Integer getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }
}
