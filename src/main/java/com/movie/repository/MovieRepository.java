package com.movie.repository;

import com.movie.model.MovieTable;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository  extends JpaRepository<MovieTable,Integer> {

}
