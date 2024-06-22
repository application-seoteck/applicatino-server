package com.seoteck.application_server.domain.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/actuator/health")
    public ResponseEntity showVersion() {
        return ResponseEntity.ok().body("application UP");
    }
}
