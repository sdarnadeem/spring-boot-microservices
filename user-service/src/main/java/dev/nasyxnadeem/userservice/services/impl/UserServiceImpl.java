package dev.nasyxnadeem.userservice.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dev.nasyxnadeem.userservice.models.User;
import dev.nasyxnadeem.userservice.repos.UserRepo;
import dev.nasyxnadeem.userservice.services.UserServices;

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
        return this.getUserById(id);
    }

    @Override
    public List<User> getUsers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User saveUser(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User updateUser(String id, User user) {
        // TODO Auto-generated method stub
        return null;
    }

}
