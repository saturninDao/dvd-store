package com.saturnindao.dvdstore.service;

import com.saturnindao.dvdstore.entity.Movie;

import java.util.Optional;


public interface MovieServiceInterface {
    Movie registerMovie(Movie movie);
    Iterable<Movie> getMovieList();
    Optional<Movie> getMovieById(long id);
}
