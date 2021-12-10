package com.saturnindao.repository.memory;

import com.saturnindao.entity.Movie;
import com.saturnindao.repository.MovieRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

public class MemoryMovieRepository implements MovieRepositoryInterface {

    private static List<Movie> movies = new ArrayList<>();

    public void add(Movie movie){
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }
}
