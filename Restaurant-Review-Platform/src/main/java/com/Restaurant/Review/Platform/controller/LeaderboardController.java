package com.Restaurant.Review.Platform.controller;

import com.Restaurant.Review.Platform.service.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LeaderboardController {

    @Autowired
    private LeaderboardService leaderboardService;

    @GetMapping("/leaderboard")
    public Object getLeaderboard() {
        return leaderboardService.getLeaderboard();
    }
}