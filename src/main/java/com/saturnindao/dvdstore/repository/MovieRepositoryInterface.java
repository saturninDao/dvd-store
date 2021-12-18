package com.saturnindao.dvdstore.repository;

import com.saturnindao.dvdstore.entity.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepositoryInterface extends CrudRepository<Movie,Long> {
}
