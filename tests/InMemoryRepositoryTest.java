package com.fitness.tracker.tests;

import com.fitness.tracker.User;
import com.fitness.tracker.Workout;
import com.fitness.tracker.repositories.inmemory.InMemoryUserRepository;
import com.fitness.tracker.repositories.inmemory.InMemoryWorkoutRepository;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.Optional;
import static org.junit.Assert.*;

public class InMemoryRepositoryTest {
    private InMemoryUserRepository userRepo;
    private InMemoryWorkoutRepository workoutRepo;
    private User user;
    private Workout workout;

    @Before
    public void setUp() {
        userRepo = new InMemoryUserRepository();
        workoutRepo = new InMemoryWorkoutRepository();
        user = new User("U1", "Alice", "alice@example.com");
        workout = new Workout("W1");
    }

    @Test
    public void testUserSaveAndFindById() {
        userRepo.save(user);
        Optional<User> found = userRepo.findById("U1");
        assertTrue(found.isPresent());
        assertEquals("Alice", found.get().getName());
    }

    @Test
    public void testUserFindAll() {
        userRepo.save(user);
        userRepo.save(new User("U2", "Bob", "bob@example.com"));
        List<User> users = userRepo.findAll();
        assertEquals(2, users.size());
    }

    @Test
    public void testUserDelete() {
        userRepo.save(user);
        userRepo.delete("U1");
        assertFalse(userRepo.findById("U1").isPresent());
    }

    @Test
    public void testWorkoutSaveAndFindById() {
        workoutRepo.save(workout);
        Optional<Workout> found = workoutRepo.findById("W1");
        assertTrue(found.isPresent());
        assertEquals("W1", found.get().getWorkoutId());
    }
}
