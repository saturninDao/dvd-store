package com.saturnindao.service;

import com.saturnindao.entity.Movie;
import com.saturnindao.repository.GoLiveMovieRepository;

public class MovieService {

    private GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();

    public void registerMovie(Movie movie){
        goLiveMovieRepository.add(movie);
    }
}
