package io.MyProject.movieinfoservice;


import io.MyProject.movieinfoservice.modelds.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResources {
    @RequestMapping("/{movieId}")
    public Movie getMovieinfo(@PathVariable ("movieId") String movieId){
    return  new Movie(movieId,"test name");

    }
}
