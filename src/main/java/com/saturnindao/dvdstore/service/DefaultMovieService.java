package com.saturnindao.dvdstore.service;

import com.saturnindao.dvdstore.entity.Movie;
import com.saturnindao.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

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

    public Movie registerMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public Iterable<Movie> getMovieList(){
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(long id) {
        Optional<Movie> optionalMovie=movieRepository.findById(id);
        if (optionalMovie.isEmpty()){
            throw new NoSuchElementException();
        }
        Movie movie=optionalMovie.get();

        movie.getReviews().forEach(review ->
                review.setMovie(null)
        );

        return movie;
    }

}
