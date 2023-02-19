package dev.nasyxnadeem.userservice.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import dev.nasyxnadeem.userservice.models.*;

@Service
@FeignClient(name = "RATING-SERVICE")
public interface RatingService {

    @GetMapping("/hotels/{hotelId}")
    Rating getHotel(@PathVariable String ratingId);
}
