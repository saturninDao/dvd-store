package com.saturnindao.repository;

import com.saturnindao.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements MovieRepositoryInterface {

    FileWriter writer;

    public void add(Movie movie){
        FileWriter writer;
        try{
            writer=new FileWriter("C:\\temp\\movies.txt",true);
            writer.write(movie.getTitle()+";"+movie.getGenre()+"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


}
