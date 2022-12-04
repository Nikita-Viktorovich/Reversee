package com.politech.game.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//CREATE TABLE Move (
//        id integer PRIMARY KEY AUTOINCREMENT,
//        cell integer,
//        user integer
//        );
@Data
@Entity
public class Move {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;
    private int cell;
    private int user;
}
