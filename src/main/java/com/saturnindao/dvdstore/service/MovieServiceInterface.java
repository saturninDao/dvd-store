package com.saturnindao.dvdstore.service;

import com.saturnindao.dvdstore.entity.Movie;

import java.util.List;


public interface MovieServiceInterface {
    void registerMovie(Movie movie);
    List<Movie> getMovieList();
}