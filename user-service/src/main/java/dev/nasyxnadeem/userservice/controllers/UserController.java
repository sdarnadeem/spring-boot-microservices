package dev.nasyxnadeem.userservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import dev.nasyxnadeem.userservice.models.*;
import dev.nasyxnadeem.userservice.services.UserServices;
import java.util.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserServices userService;

    // CRAETE USER
    @PostMapping("")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User newUser = this.userService.saveUser(user);
        return ResponseEntity.ok(newUser);
    }

    @GetMapping("")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = this.userService.getUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable String userId) {
        User user = this.userService.getUserById(userId);
        return ResponseEntity.ok(user);
    }
}
