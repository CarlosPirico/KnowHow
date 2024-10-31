package com.knowhow.model;
//Importações para mapeamento objeto-relacional
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Exercise {
	
	//Configurando colunas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subjectId;
    
    @Column(nullable = false, length = 50)
    private String tip;
    
    @Column(nullable = false, length = 500)
    private String content;
    
    @Column(nullable = false, precision = 20, scale = 0)
    private Double level;
    
    @Column(name = "exercise_description", nullable = false, length = 150)
    private String exerciseDescription;
    
    @Column(nullable = false, length = 200)
    private String solution;
    
    @Column(name = "exercise_type", length = 50, columnDefinition = "varchar(50) default 'multiple_choice'")
    private String exerciseType;

    // Construtor padrão JPA
    public Exercise() {}

    //Construtor dos atributos da classe
    public Exercise(String tip, String content, Double level, String exerciseDescription, String solution, String exerciseType) {
        this.tip = tip;
        this.content = content;
        this.level = level;
        this.exerciseDescription = exerciseDescription;
        this.solution = solution;
        this.exerciseType = exerciseType;
    }

    //Getters e Setters
    public Integer getSubjectId() {
        return subjectId;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Double getLevel() {
        return level;
    }

    public void setLevel(Double level) {
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
