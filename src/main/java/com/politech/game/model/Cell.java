package com.politech.game.model;

//CREATE TABLE cell (
//        id integer PRIMARY KEY AUTOINCREMENT,
//        number integer,
//        letter text
//        );

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Cell {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;
    private int number;
    private String letter;
}
