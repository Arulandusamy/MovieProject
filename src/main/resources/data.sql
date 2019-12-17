DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  movie_name VARCHAR(250) NOT NULL,
  year INTEGER NOT NULL,
   ratings DOUBLE NOT NULL,
   rated VARCHAR(250) NOT NULL,
);