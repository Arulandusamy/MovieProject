package com.movie.model;

import javax.persistence.*;

@Entity
@Table(name="movies")
public class MovieTable {

    @Id
    @GeneratedValue
    @Column(name="id", nullable = false)
    private Integer id;
    @Column(name="movie_name", nullable = false)
    private String movieName;
    @Column(name="year", nullable = false)
    private Integer year;
    @Column(name="ratings", nullable = false)
    private Double ratings;
    @Column(name="rated", nullable = false)
    private String rated;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getRatings() {
        return ratings;
    }

    public void setRatings(Double ratings) {
        this.ratings = ratings;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

}
