package com.fitness.tracker.patterns;

public abstract class DataProcessorFactory {
    public abstract DataProcessor createProcessor();
}

class HeartRateProcessorFactory extends DataProcessorFactory {
    @Override
    public DataProcessor createProcessor() { return new HeartRateProcessor(); }
}

class CalorieProcessorFactory extends DataProcessorFactory {
    @Override
    public DataProcessor createProcessor() { return new CalorieProcessor(); }
}

interface DataProcessor {
    void process();
}

class HeartRateProcessor implements DataProcessor {
    public void process() { /* Process heart rate */ }
}

class CalorieProcessor implements DataProcessor {
    public void process() { /* Process calories */ }
}
