package com.saturnindao.service;

import com.saturnindao.entity.Movie;
import com.saturnindao.repository.GoLiveMovieRepository;
import com.saturnindao.repository.MovieRepositoryInterface;

public class MovieService implements MovieServiceInterface {

    private MovieRepositoryInterface goLiveMovieRepository;

    public void registerMovie(Movie movie){
        goLiveMovieRepository.add(movie);
    }
}
