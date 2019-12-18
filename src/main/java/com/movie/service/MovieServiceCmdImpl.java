package com.movie.service;

import com.movie.model.Movie;
import com.movie.model.MovieTable;
import com.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class MovieServiceCmdImpl implements MovieServiceCmd {

    @Autowired
    private MovieRepository movieRepo;

    /**
     * Method will add movie  details to H2 DataBase
     * @param movie
     */
    @Override
    public void addMovies(Movie movie) {
        // add movies
        MovieTable inpData = new MovieTable();
        inpData.setMovieName(movie.getMovieName());
        inpData.setYear(movie.getYear());
        inpData.setRatings(movie.getRatings());
        inpData.setRated(movie.getRated());
        movieRepo.save(inpData);
    }

    /**
     * Mehtod to retrieve all movie details
     * @return
     */
    @Override
    public List<MovieTable> getMovies() {
        List<MovieTable> results = movieRepo.findAll();
        return results;
    }

    /**
     * Delete movie details by movie#
     * @param id
     */
    @Override
    public void deleteMvoie(Integer id) {
        movieRepo.deleteById(id);
    }
}
