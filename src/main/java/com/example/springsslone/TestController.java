package com.example.springsslone;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/v1")
public class TestController {

    @GetMapping("/home")
    public ResponseEntity<?> testResponse(){
        return ResponseEntity.ok(Map.of("status", "OK", "success", true));
    }
}
