package dev.nasyxnadeem.userservice.models;

import java.util.*;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;

    private String name;

    private String email;

    private String about;

    @Transient
    private List<Rating> ratings;
}
