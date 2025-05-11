package com.fitness.tracker.api;

     import com.fitness.tracker.User;
     import com.fitness.tracker.services.UserService;
     import org.springframework.beans.factory.annotation.Autowired;
     import org.springframework.http.ResponseEntity;
     import org.springframework.web.bind.annotation.*;

     @RestController
     @RequestMapping("/api/users")
     public class UserController {
         private final UserService userService;

         @Autowired
         public UserController(UserService userService) {
             this.userService = userService;
         }

         @PostMapping
         public ResponseEntity<User> createUser(@RequestBody User user) {
             User createdUser = userService.createUser(user);
             return ResponseEntity.ok(createdUser);
         }

         @GetMapping("/{userId}")
         public ResponseEntity<User> getUserById(@PathVariable String userId) {
             User user = userService.getUserById(userId);
             if (user != null) {
                 return ResponseEntity.ok(user);
             }
             return ResponseEntity.notFound().build();
         }
     }