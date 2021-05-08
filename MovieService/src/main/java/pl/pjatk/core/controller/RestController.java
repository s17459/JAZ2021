package pl.pjatk.core.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/home")
public class RestController {

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return ResponseEntity.ok(movieServices.getAllmovies)
    }
}
