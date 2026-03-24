package com.Restaurant.Review.Platform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class LeaderboardService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    private static final String KEY = "leaderboard";

    public void updateScore(Long restaurantId, int score) {
        redisTemplate.opsForZSet()
                .incrementScore(KEY, restaurantId.toString(), score);
    }

    public Set<ZSetOperations.TypedTuple<String>> getLeaderboard() {
        return redisTemplate.opsForZSet()
                .reverseRangeWithScores(KEY, 0, 9);
    }
}