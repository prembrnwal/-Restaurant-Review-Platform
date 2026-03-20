package com.Restaurant.Review.Platform.repository;

import com.Restaurant.Review.Platform.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {}

