package com.fitness.tracker.api;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    // Controller methods go here inside the class
    
    @GetMapping
    public String getAllUsers() {
        return "All users";
    }
    
    // Other endpoint methods...
}