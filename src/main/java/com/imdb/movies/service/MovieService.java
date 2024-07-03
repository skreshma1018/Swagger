package com.imdb.movies.service;

import com.imdb.movies.entity.Movies;
import com.imdb.movies.exception.ServiceException;
import com.imdb.movies.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MovieService {

    Logger logger= LoggerFactory.getLogger(MovieService.class);

    @Autowired
    private MovieRepository movieRepository;

    public List<Movies> getAllMovie(){
        List<Movies> moviesList = Collections.emptyList();
        try{
            moviesList= movieRepository.findAll();
            logger.info("fetched success");
        } catch(Exception e){
            logger.info("getAllMovie error ",e);
            throw new ServiceException("Error While fetching movies",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return moviesList;
    }



}
