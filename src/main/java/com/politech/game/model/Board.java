package com.politech.game.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//CREATE TABLE board (
//        id integer PRIMARY KEY AUTOINCREMENT,
//        size_nums integer,
//        size_letters integer,
//        cells integer
//        );
@Data
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;
    private int sizeNums;
    private int sizeLetters;
    private int cells;
}
