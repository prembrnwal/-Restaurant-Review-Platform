package com.Restaurant.Review.Platform.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long restaurantId;

    @Column(length = 1000)
    private String reviewText;

    private String sentiment; // positive/negative
    private int score; // +1 or -1

    private LocalDateTime createdAt = LocalDateTime.now();
}