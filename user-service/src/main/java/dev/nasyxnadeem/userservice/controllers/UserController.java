package dev.nasyxnadeem.userservice.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    // CRAETE USER
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return null;
    }

}
