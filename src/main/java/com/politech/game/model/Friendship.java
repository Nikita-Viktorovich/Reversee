package com.politech.game.model;


//CREATE TABLE frindship (
//        id integer PRIMARY KEY AUTOINCREMENT,
//        user_following integer,
//        user_follower integer,
//        status integer
//        );

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Friendship {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;
    private int userFollowing;
    private int userFollower;
    private int status;
}
