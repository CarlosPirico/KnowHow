package com.knowhow.model;

//Importações para mapeamento objeto-relacional
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class LevelSystem {

	//Configurando colunas
    @Id
    private Integer id;

    @Column(name = "min_points", nullable = false)
    private Integer minPoints;

    // Construtor padrão JPA
    public LevelSystem() {}

    //Construtor dos atributos da classe
    public LevelSystem(Integer id, Integer minPoints) {
        this.id = id;
        this.minPoints = minPoints;
    }

    //Getters e Setters
    public Integer getLevel() {
        return id;
    }

    public void getId(Integer id) {
        this.id = id;
    }

    public Integer getMinPoints() {
        return minPoints;
    }

    public void setMinPoints(Integer minPoints) {
        this.minPoints = minPoints;
    }
}
