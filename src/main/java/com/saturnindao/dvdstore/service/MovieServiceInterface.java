package com.saturnindao.dvdstore.service;

import com.saturnindao.dvdstore.entity.Movie;

import java.util.List;


public interface MovieServiceInterface {
    Movie registerMovie(Movie movie);
    List<Movie> getMovieList();

    Movie getMovieById(long id);
}
