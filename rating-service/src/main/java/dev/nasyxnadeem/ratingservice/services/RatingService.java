package dev.nasyxnadeem.ratingservice.services;

import dev.nasyxnadeem.ratingservice.models.*;
import java.util.*;

public interface RatingService {

    // create
    Rating create(Rating rating);

    // get all rating
    List<Rating> getRatings();

    // get all by userid

    List<Rating> getRatingByUserId(String userId);

    // get all by hotelid
    List<Rating> getRatingByHotelId(String hotelId);
}
