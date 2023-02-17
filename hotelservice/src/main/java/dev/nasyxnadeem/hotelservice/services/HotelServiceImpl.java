package dev.nasyxnadeem.hotelservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.nasyxnadeem.hotelservice.models.Hotel;
import dev.nasyxnadeem.hotelservice.repos.*;
import dev.nasyxnadeem.hotelservice.exceptions.*;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepo;

    @Override
    public Hotel create(Hotel hotel) {
        return this.hotelRepo.save(hotel);
    }

    @Override
    public Hotel getHotel(String id) {
        return this.hotelRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Resource not found"));
    }

    @Override
    public List<Hotel> getHotels() {
        return this.hotelRepo.findAll();
    }

}
