package com.fitness.tracker.tests;

import com.fitness.tracker.patterns.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class CreationalPatternsTest {
    @Test
    public void testSimpleFactory() {
        WorkoutFactory factory = new WorkoutFactory();
        Workout cardio = factory.createWorkout("cardio", "W1");
        assertTrue(cardio instanceof CardioWorkout);
    }

    @Test
    public void testFactoryMethod() {
        DataProcessorFactory factory = new HeartRateProcessorFactory();
        DataProcessor processor = factory.createProcessor();
        assertTrue(processor instanceof HeartRateProcessor);
    }

    @Test
    public void testAbstractFactory() {
        UIFactory factory = new MobileUIFactory();
        Button button = factory.createButton();
        assertTrue(button instanceof MobileButton);
    }

    @Test
    public void testBuilder() {
        Goal goal = new GoalBuilder()
            .setGoalId("G1")
            .setTarget(1000.0f)
            .setType("Steps")
            .build();
        assertEquals("G1", goal.getGoalId());
    }

    @Test
    public void testPrototype() {
        HeartRate original = new HeartRate("HR1", 80);
        HeartRate clone = original.clone();
        assertEquals(original.getBPM(), clone.getBPM());
    }

    @Test
    public void testSingleton() {
        DatabaseConnection instance1 = DatabaseConnection.getInstance();
        DatabaseConnection instance2 = DatabaseConnection.getInstance();
        assertSame(instance1, instance2);
    }
}
