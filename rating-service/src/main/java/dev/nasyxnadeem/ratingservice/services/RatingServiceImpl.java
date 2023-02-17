package dev.nasyxnadeem.ratingservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.nasyxnadeem.ratingservice.models.Rating;
import dev.nasyxnadeem.ratingservice.repos.*;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepo repo;

    @Override
    public Rating create(Rating rating) {
        return this.repo.save(rating);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return this.repo.findByHotelId(hotelId);
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {

        return this.repo.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatings() {
        return this.repo.findAll();

    }

}
