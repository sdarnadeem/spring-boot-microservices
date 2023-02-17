package dev.nasyxnadeem.ratingservice.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import dev.nasyxnadeem.ratingservice.models.*;
import java.util.List;

public interface RatingRepo extends MongoRepository<Rating, String> {

    // CUSTOM METHODS
    List<Rating> findByUserId(String userId);

    List<Rating> findByHotelId(String hotelId);

}
