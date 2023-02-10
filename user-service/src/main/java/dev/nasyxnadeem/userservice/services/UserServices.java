package dev.nasyxnadeem.userservice.services;

import java.util.List;

import dev.nasyxnadeem.userservice.models.User;

public interface UserServices {

    User saveUser(User user);

    List<User> getUsers();

    User getUserById(String id);

    void deleteUser(String id);

    User updateUser(String id, User user);
}
