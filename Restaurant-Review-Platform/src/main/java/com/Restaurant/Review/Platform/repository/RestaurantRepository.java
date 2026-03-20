package com.Restaurant.Review.Platform.repository;

import com.Restaurant.Review.Platform.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {}