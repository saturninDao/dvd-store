package com.saturnindao.controller;

import com.saturnindao.entity.Movie;
import com.saturnindao.service.MovieService;
import com.saturnindao.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {

    MovieServiceInterface movieService;

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
