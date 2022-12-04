package com.politech.game.model;


//CREATE TABLE Session (
//        id integer PRIMARY KEY AUTOINCREMENT,
//        board integer,
//        rules integer,
//        time integer,
//        time_to_move integer,
//        user_turn integer,
//        movements integer
//        );

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;
    private int board;
    private int rules;
    private long timestamp;
    private int timeToMove;
    private int userTurn;
    private int movements;

}
