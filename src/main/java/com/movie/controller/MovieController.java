package com.movie.controller;

import com.movie.model.Movie;
import com.movie.service.MovieServiceCmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
@CrossOrigin("*")
public class MovieController {

    @Autowired
    private MovieServiceCmd movieService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity addMovie(@RequestBody Movie movie) {
        movieService.addMovies(movie);
        return new ResponseEntity(movie, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getMovies(){
        return new ResponseEntity(movieService.getMovies(),HttpStatus.OK);
    }

    @DeleteMapping(path="/id/{id}")
    public ResponseEntity deleteMovie(@PathVariable Integer id){
        movieService.deleteMvoie(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
