package com.knowhow.model;

//Importações para mapeamento objeto-relacional
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Answer {

	//Configurando colunas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "answer_text", length = 300)
    private String answerText;

    @Column(name = "question_id")
    private Integer questionId;

    @Column(name = "is_correct", nullable = false)
    private Boolean isCorrect = false; // Inicializa como false por padrão

    // Construtor padrão JPA
    public Answer() {}

    //Construtor dos atributos da classe
    public Answer(String answerText, Integer questionId, Boolean isCorrect) {
        this.answerText = answerText;
        this.questionId = questionId;
        this.isCorrect = isCorrect;
    }

    //Getters e Setters
    public Integer getId() {
        return id;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Boolean getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(Boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
}
