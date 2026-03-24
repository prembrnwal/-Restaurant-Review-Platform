package com.Restaurant.Review.Platform.controller;

import com.Restaurant.Review.Platform.entity.Restaurant;
import com.Restaurant.Review.Platform.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantRepository repository;

    @PostMapping
    public Restaurant add(@RequestBody Restaurant r) {
        return repository.save(r);
    }

    @GetMapping
    public List<Restaurant> getAll() {
        return repository.findAll();
    }
}