package com.knowhow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;


@Entity
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Subject subject;

    @Column(nullable = false, length = 500)
    private String content;

    @Column(nullable = false)
    private Integer level;

    @Column(name = "exercise_description", nullable = false, length = 150)
    private String exerciseDescription;

    @Column(nullable = false, length = 200)
    private String solution;

    @Column(name = "exercise_type", length = 50)
    private String exerciseType;

    // Construtor padrão JPA
    public Exercise() {}

    // Construtor dos atributos da classe
    public Exercise(Subject subject, String content, Integer level, String exerciseDescription, String solution, String exerciseType) {
        this.subject = subject;
        this.content = content;
        this.level = level;
        this.exerciseDescription = exerciseDescription;
        this.solution = solution;
        this.exerciseType = exerciseType;
    }

    // Getters e Setters
    public Integer getExerciseId() {
        return id;
    }

    public void setExerciseId(Integer exerciseId) {
        this.id = exerciseId;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getExerciseDescription() {
        return exerciseDescription;
    }

    public void setExerciseDescription(String exerciseDescription) {
        this.exerciseDescription = exerciseDescription;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }
}
