package com.Restaurant.Review.Platform.controller;

import com.Restaurant.Review.Platform.entity.Review;
import com.Restaurant.Review.Platform.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/review")
    public Review addReview(@RequestBody Review review) {
        return reviewService.addReview(review);
    }
}