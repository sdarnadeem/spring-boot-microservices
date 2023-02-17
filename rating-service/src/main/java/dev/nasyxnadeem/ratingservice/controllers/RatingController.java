package dev.nasyxnadeem.ratingservice.controllers;

import org.springframework.web.bind.annotation.*;
import dev.nasyxnadeem.ratingservice.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import dev.nasyxnadeem.ratingservice.models.*;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService service;

    // CREATE RATING
    @PostMapping("")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        Rating newRating = this.service.create(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(newRating);

    }

    @GetMapping("")
    public ResponseEntity<List<Rating>> getRatingList() {
        List<Rating> list = this.service.getRatings();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping("/userId/{userId}")
    public ResponseEntity<List<Rating>> getRatingListByUserId(@PathVariable String userId) {
        List<Rating> list = this.service.getRatingByUserId(userId);
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping("/hotelId/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingListByhotelId(@PathVariable String hotelId) {
        List<Rating> list = this.service.getRatingByHotelId(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

}
