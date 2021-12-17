package com.saturnindao.dvdstore.repository.memory;

import com.saturnindao.dvdstore.entity.Movie;
import com.saturnindao.dvdstore.repository.MovieRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class MemoryMovieRepository implements MovieRepositoryInterface {

    public static long lastId=0L;

    private static List<Movie> movies = new ArrayList<>();

    public void add(Movie movie){
        movie.setId(lastId++);
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }

    @Override
    public List<Movie> list() {
        return movies;
    }

    @Override
    public Movie getById(long id) {
        return movies.stream().
                filter(m -> m.getId()==id).
                findFirst().get();
    }
}
