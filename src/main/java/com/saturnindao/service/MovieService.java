package com.saturnindao.service;

import com.saturnindao.entity.Movie;
import com.saturnindao.repository.MovieRepository;

import java.util.List;

public class MovieService {

    private MovieRepository movieRepository = new MovieRepository();

    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }
}
