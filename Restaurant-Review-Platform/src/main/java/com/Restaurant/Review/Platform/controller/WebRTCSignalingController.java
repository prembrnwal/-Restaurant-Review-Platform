package com.Restaurant.Review.Platform.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebRTCSignalingController {

    // Signaling endpoint for WebRTC peers connecting for "live jamming" or "live review"
    @MessageMapping("/signaling")
    @SendTo("/topic/webrtc")
    public String processSignalingMessage(@Payload String message) {
        // Broadcast the SDP offer/answer or ICE candidate to all peers in the topic
        return message;
    }
}
