package com.Restaurant.Review.Platform.NLPService;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class NLPService {

    private final RestTemplate restTemplate = new RestTemplate();

    public Map<String, Object> analyze(String text) {
        String url = "http://localhost:5000/analyze";

        Map<String, String> request = new HashMap<>();
        request.put("text", text);

        return restTemplate.postForObject(url, request, Map.class);
    }
}