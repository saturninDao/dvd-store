package com.saturnindao.dvdstore.service;

import com.saturnindao.dvdstore.entity.Movie;
import com.saturnindao.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMovieService implements MovieServiceInterface {

    @Autowired
    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }



    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }

    public List<Movie>getMovieList(){
        return movieRepository.list();
    }

}