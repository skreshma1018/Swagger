package com.imdb.movies.controller;

import com.imdb.movies.entity.Movies;
import com.imdb.movies.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    Logger logger= LoggerFactory.getLogger(MovieController.class);


    @Autowired
    private MovieService movieService;


    @GetMapping("/")
    public List<Movies> getAllMovies(){
        logger.trace("starting get all movies method with trace log level");
        logger.info("starting get all movies method with trace log level");
        return movieService.getAllMovie();
    }

}
