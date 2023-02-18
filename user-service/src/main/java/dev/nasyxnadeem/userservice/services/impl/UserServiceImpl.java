package dev.nasyxnadeem.userservice.services.impl;

import java.util.*;
import java.util.stream.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dev.nasyxnadeem.userservice.exceptions.ResourceNotFoundException;
import dev.nasyxnadeem.userservice.models.*;
import dev.nasyxnadeem.userservice.repos.UserRepo;
import dev.nasyxnadeem.userservice.services.UserServices;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void deleteUser(String id) {
        User user = this.getUserById(id);
        this.userRepo.delete(user);
    }

    @Override
    public User getUserById(String id) {
        // get user
        User user = this.userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));

        // fetch rating of the above user
        String url = "http://localhost:3002/ratings/userId/" + id;
        // List<Rating> rat = new ArrayList<Rating>();
        // @SuppressWarnings("unchecked")
        Rating[] ratingsOfUser = restTemplate.getForObject(url, Rating[].class);
        List<Rating> ratings = Arrays.stream(ratingsOfUser).toList();

        List<Rating> newRatings = ratings.stream().map(rating -> {

            // {{3002}}/ratings/hotelId/jdfhjf
            String uri = "http://localhost:3001/hotels/" + rating.getHotelId();
            Hotel hotel = restTemplate.getForObject(uri, Hotel.class);

            rating.setHotel(hotel);

            return rating;

        }).collect(Collectors.toList());
        user.setRatings(newRatings);
        return user;
    }

    @Override
    public List<User> getUsers() {
        return this.userRepo.findAll();
    }

    @Override
    public User saveUser(User user) {
        return this.userRepo.save(user);
    }

    @Override
    public User updateUser(String id, User user) {
        return null;
    }

}
