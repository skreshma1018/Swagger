package com.imdb.movies.controller;

import com.imdb.movies.entity.Movies;
import com.imdb.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class controller {


    @Autowired
    private MovieService movieService;


    @GetMapping("/")
    public List<Movies> getAllMovies(){
        return movieService.getAllMovie();
    }

}
