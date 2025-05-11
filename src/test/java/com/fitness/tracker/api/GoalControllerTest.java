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
public class GoalControllerTest {

    @Autowired
    private GoalController goalController;

    private MockMvc mockMvc;

    @Test
    public void getGoals_returnsOk() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(goalController).build();

        mockMvc.perform(get("/api/goals"))
               .andExpect(status().isOk());
    }
}

