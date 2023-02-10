package dev.nasyxnadeem.userservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.nasyxnadeem.userservice.models.User;

public interface UserRepo extends JpaRepository<User, String> {

}
