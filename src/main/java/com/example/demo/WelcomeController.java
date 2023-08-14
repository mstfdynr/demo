package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class WelcomeController {

    @GetMapping({"/", "/home"})
    public String home() {
        return "Merhaba!";
    }

    @GetMapping("/welcome")
    public String welcome() {

        return "Welcome.";
    }
}