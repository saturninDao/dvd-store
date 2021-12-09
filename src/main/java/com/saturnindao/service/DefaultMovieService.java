package com.saturnindao.service;

import com.saturnindao.entity.Movie;
import com.saturnindao.repository.MovieRepositoryInterface;

public class DefaultMovieService implements MovieServiceInterface {

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    private MovieRepositoryInterface movieRepository;



    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }

}
