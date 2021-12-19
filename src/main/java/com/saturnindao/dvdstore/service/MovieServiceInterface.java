package com.saturnindao.dvdstore.service;

import com.saturnindao.dvdstore.entity.Movie;


public interface MovieServiceInterface {
    Movie registerMovie(Movie movie);
    Iterable<Movie> getMovieList();
    Movie getMovieById(long id);
}
