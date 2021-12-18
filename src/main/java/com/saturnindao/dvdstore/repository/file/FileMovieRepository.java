package com.saturnindao.dvdstore.repository.file;

import com.saturnindao.dvdstore.entity.Movie;
import com.saturnindao.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FileMovieRepository implements MovieRepositoryInterface {

    private static final String UNKNOWN = "UNKNOWN"; // Compliant

    FileWriter writer;

    @Value("${movies.file.location}")
    File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }


    public Movie add(Movie movie){

        long lastId=list().stream().map(Movie::getId).max(Long::compare).orElse(0L);
        movie.setId(lastId+1);

        FileWriter writer;
        try{
            writer=new FileWriter(file,true);
            writer.write(movie.getId()+";"+movie.getTitle()+";"+movie.getGenre()+";"+movie.getDescription()+"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("The movie "+movie.getTitle()+" has been added.");
        return movie;
    }

    @Override
    public List<Movie> list() {
        List<Movie> movies=new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            for(String line; (line = br.readLine()) != null; ) {
                final Movie movie=new Movie();
                final String[] allProperties  = line.split("\\;");
                movie.setId(Long.parseLong(allProperties[0]));
                movie.setTitle(allProperties [1]);
                movie.setGenre(allProperties [2]);
                movie.setDescription(allProperties [3]);
                movies.add(movie);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }

    @Override
    public Movie getById(long id) {
        final Movie movie = new Movie();
        movie.setId(id);
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            for(String line; (line = br.readLine()) != null; ) {

                final String[] allProperties = line.split("\\;");
                final long nextMovieId=Long.parseLong(allProperties[0]);
                if (nextMovieId==id) {
                    movie.setTitle(allProperties[1]);
                    movie.setGenre(allProperties[2]);
                    movie.setDescription(allProperties[3]);
                    return movie;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("A movie from the file does not have a proper id");
            e.printStackTrace();
        }
        movie.setTitle(UNKNOWN);
        movie.setGenre(UNKNOWN);
        movie.setDescription(UNKNOWN);
        return movie;
    }


}
