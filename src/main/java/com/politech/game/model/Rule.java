package com.politech.game.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



//CREATE TABLE rule (
//        id integer PRIMARY KEY AUTOINCREMENT
//        );
@Data
@Entity
public class Rule {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;
    private boolean isRating;
}
