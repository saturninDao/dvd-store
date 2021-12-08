package com.saturnindao;

import com.saturnindao.controller.MovieController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MovieController movieController = new MovieController();
        movieController.addUsingConsole();
    }
}
