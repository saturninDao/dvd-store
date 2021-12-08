package com.saturnindao;

import com.saturnindao.entity.Movie;
import com.saturnindao.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "What is the title of film that you want to add ?" );
        Scanner scannerTitle = new Scanner(System.in);
        Movie movie = new Movie();
        movie.setTitle(scannerTitle.nextLine());
        System.out.println( "What is the genre of film that you want to add ?" );
        Scanner scannerGenre = new Scanner(System.in);
        movie.setGenre(scannerGenre.nextLine());

        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);





    }
}
