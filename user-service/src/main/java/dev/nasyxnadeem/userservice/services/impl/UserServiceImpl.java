package dev.nasyxnadeem.userservice.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.nasyxnadeem.userservice.exceptions.ResourceNotFoundException;
import dev.nasyxnadeem.userservice.models.User;
import dev.nasyxnadeem.userservice.repos.UserRepo;
import dev.nasyxnadeem.userservice.services.UserServices;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepo userRepo;

    @Override
    public void deleteUser(String id) {
        User user = this.getUserById(id);
        this.userRepo.delete(user);
    }

    @Override
    public User getUserById(String id) {
        return this.userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
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
