package com.politech.game.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Blob;

//CREATE TABLE User (
//        id integer PRIMARY KEY AUTOINCREMENT,
//        name text,
//        image blob,
//        description text,
//        raiting integer,
//        hashed_pwd blob,
//        stats integer,
//        frinds integer
//        );
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private long id;
    private String name;
    private String image;
    private String description;
    private int rating;
    private String hashedPwd;
    private int stats;
    private int friends;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
