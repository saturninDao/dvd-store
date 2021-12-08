package com.saturnindao;

import com.saturnindao.controller.MovieController;
import com.saturnindao.repository.FileMovieRepository;
import com.saturnindao.service.DefaultMovieService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MovieController movieController = new MovieController();
        FileMovieRepository movieRepository=new FileMovieRepository();
        DefaultMovieService movieService=new DefaultMovieService();
        movieController.setMovieService(movieService);
        movieService.setMovieRepository(movieRepository);
        movieController.addUsingConsole();
    }
}
