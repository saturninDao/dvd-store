package com.saturnindao.dvdstore.repository;

import com.saturnindao.dvdstore.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {
    void add(Movie movie);
    List<Movie> list();

    Movie getById(long id);
}
