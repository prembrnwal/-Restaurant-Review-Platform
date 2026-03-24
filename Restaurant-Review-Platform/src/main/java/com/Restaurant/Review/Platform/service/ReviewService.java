package com.Restaurant.Review.Platform.service;

import com.Restaurant.Review.Platform.NLPService.NLPService;
import com.Restaurant.Review.Platform.entity.Review;
import com.Restaurant.Review.Platform.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private NLPService nlpService;

    @Autowired
    private LeaderboardService leaderboardService;

    public Review addReview(Review review) {

        Map<String, Object> result = nlpService.analyze(review.getReviewText());

        String sentiment = (String) result.get("sentiment");
        int score = (int) result.get("score");

        review.setSentiment(sentiment);
        review.setScore(score);

        Review saved = reviewRepository.save(review);

        leaderboardService.updateScore(review.getRestaurantId(), score);

        return saved;
    }
}