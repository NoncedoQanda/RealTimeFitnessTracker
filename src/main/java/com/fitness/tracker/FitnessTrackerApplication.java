package com.fitness.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.fitness.tracker.repository.UserRepository;
import com.fitness.tracker.repository.WorkoutRepository;
import com.fitness.tracker.repository.GoalRepository;

@SpringBootApplication
public class FitnessTrackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FitnessTrackerApplication.class, args);
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public WorkoutRepository workoutRepository() {
        return new WorkoutRepository();
    }

    @Bean
    public GoalRepository goalRepository() {
        return new GoalRepository();
    }
}