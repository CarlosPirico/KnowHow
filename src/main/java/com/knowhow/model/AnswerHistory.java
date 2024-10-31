package com.knowhow.model;

// Importações para mapeamento objeto-relacional
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AnswerHistory {

    // Configurando colunas (todas são Foreign Keys)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer answerHistoryId;

    @Column(name = "total_points", nullable = false)
    private Integer totalPoints;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "answer_history_ibfk_1"))
    private User user; // Relacionamento com a entidade User

    @ManyToOne
    @JoinColumn(name = "answer_id", nullable = false, foreignKey = @ForeignKey(name = "answer_history_ibfk_2"))
    private Answer answer; // Relacionamento com a entidade Answer

    @ManyToOne
    @JoinColumn(name = "level_id", nullable = false, foreignKey = @ForeignKey(name = "answer_history_ibfk_3"))
    private LevelSystem level; // Relacionamento com a entidade LevelSystem

    // Construtor padrão JPA
    public AnswerHistory() {}

    // Construtor dos atributos da classe
    public AnswerHistory(Integer totalPoints, User user, Answer answer, LevelSystem level) {
        this.totalPoints = totalPoints;
        this.user = user;
        this.answer = answer;
        this.level = level;
    }

    // Getters e Setters
    public Integer getAnswerHistoryId() {
        return answerHistoryId;
    }

    public Integer getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public LevelSystem getLevel() {
        return level;
    }

    public void setLevel(LevelSystem level) {
        this.level = level;
    }
}
