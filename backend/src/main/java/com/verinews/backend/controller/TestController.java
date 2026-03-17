package com.verinews.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // permite que React se conecte
public class TestController {

    @GetMapping("/api/test")
    public String test() {
        return "Backend funcionando 🚀";
    }
}