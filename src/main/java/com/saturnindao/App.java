package com.saturnindao;

import com.saturnindao.controller.MovieController;
import com.saturnindao.repository.GoLiveMovieRepository;
import com.saturnindao.service.MovieService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MovieController movieController = new MovieController();
        GoLiveMovieRepository movieRepository=new GoLiveMovieRepository();
        MovieService movieService=new MovieService();
        movieController.setMovieService(movieService);
        movieService.setMovieRepository(movieRepository);
        movieController.addUsingConsole();
    }
}
