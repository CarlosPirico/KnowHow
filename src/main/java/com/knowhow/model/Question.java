package com.knowhow.model;

// Importações para mapeamento objeto-relacional
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Question {

    // Configurando colunas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "question_text", nullable = false, length = 300)
    private String questionText;

    @Column(nullable = false)
    private Integer level;

    @Column(name = "subject_id", nullable = false)
    private int subjectId;
    
    // Construtor padrão JPA
    public Question() {}

    // Construtor dos atributos da classe
    public Question(String questionText, Integer level, int subjectId) {
        this.questionText = questionText;
        this.level = level;
        this.subjectId = subjectId;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public int getSubjectId() {
        return subjectId; 
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId; 
    }
}
