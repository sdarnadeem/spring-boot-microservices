package dev.nasyxnadeem.hotelservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import dev.nasyxnadeem.hotelservice.services.*;
import dev.nasyxnadeem.hotelservice.models.*;
import org.springframework.http.ResponseEntity;
import java.util.*;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        Hotel newHotel = this.hotelService.create(hotel);
        return ResponseEntity.ok(newHotel);
    }

    @GetMapping("")
    public ResponseEntity<List<Hotel>> getHotels() {
        List<Hotel> hotels = this.hotelService.getHotels();
        return ResponseEntity.ok(hotels);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId) {
        Hotel hotel = this.hotelService.getHotel(hotelId);
        return ResponseEntity.ok(hotel);
    }
}
