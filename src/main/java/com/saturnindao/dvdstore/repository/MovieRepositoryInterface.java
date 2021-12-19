package com.saturnindao.dvdstore.repository;

import com.saturnindao.dvdstore.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepositoryInterface extends CrudRepository<Movie,Long> {
}
