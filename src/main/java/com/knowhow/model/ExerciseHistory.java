package com.knowhow.model;

// Importações para mapeamento objeto-relacional
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Column;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ExerciseHistory {

    // Configurando colunas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer exerciseHistoryId;

    @ManyToOne
    @JoinColumn(name = "exercise_id", nullable = false, foreignKey = @ForeignKey(name = "exercise_history_ibfk_1"))
    private Exercise exercise; // Relacionamento com a entidade Exercise

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "exercise_history_ibfk_2"))
    private User user; // Relacionamento com a entidade User

    // Construtor padrão JPA
    public ExerciseHistory() {}

    // Construtor dos atributos da classe
    public ExerciseHistory(Exercise exercise, User user) {
        this.exercise = exercise;
        this.user = user;
    }

    // Getters e Setters
    public Integer getExerciseHistoryId() {
        return exerciseHistoryId;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
