package com.imdb.movies.service;

import com.imdb.movies.entity.Movies;
import com.imdb.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movies> getAllMovie(){
        return  movieRepository.findAll();
    }

}
