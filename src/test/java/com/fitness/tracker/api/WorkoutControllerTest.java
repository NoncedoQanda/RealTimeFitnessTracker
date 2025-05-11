package com.fitness.tracker.api;

import com.fitness.tracker.RealTimeFitnessTrackerApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = RealTimeFitnessTrackerApplication.class)
public class WorkoutControllerTest {

    @Autowired
    private WorkoutController workoutController;

    private MockMvc mockMvc;

    @Test
    public void getWorkoutById_existingWorkout_returnsWorkout() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(workoutController).build();

        mockMvc.perform(get("/api/workouts/1"))
               .andExpect(status().isOk());
    }
}
