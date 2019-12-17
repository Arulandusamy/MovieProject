package com.movie.service;

import com.movie.model.Movie;
import com.movie.model.MovieTable;

import java.util.List;

public interface MovieServiceCmd {

    public void addMovies(Movie movie);

    public List<MovieTable> getMovies();

    public void deleteMvoie(Integer id);
}
