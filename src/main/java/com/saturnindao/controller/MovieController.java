package com.saturnindao.controller;

import com.saturnindao.entity.Movie;
import com.saturnindao.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class MovieController {

    @Autowired
    MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void addUsingConsole(){
        System.out.println( "What is the title of film that you want to add ?" );
        Scanner scannerTitle = new Scanner(System.in);
        Movie movie = new Movie();
        movie.setTitle(scannerTitle.nextLine());
        System.out.println( "What is the genre of film that you want to add ?" );
        Scanner scannerGenre = new Scanner(System.in);
        movie.setGenre(scannerGenre.nextLine());
        movieService.registerMovie(movie);
    }
}
