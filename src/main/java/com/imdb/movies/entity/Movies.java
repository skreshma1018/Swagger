package com.imdb.movies.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Movies {
// optimze auto imports
   @Id
   @GeneratedValue
    private int id;
    private String name;
    private int year;
    @Column(name = "rankscore")
    private Double rankScore;



}
