package com.fitness.tracker.patterns;

public interface UIFactory {
    Button createButton();
    Display createDisplay();
}

class MobileUIFactory implements UIFactory {
    public Button createButton() { return new MobileButton(); }
    public Display createDisplay() { return new MobileDisplay(); }
}

class WebUIFactory implements UIFactory {
    public Button createButton() { return new WebButton(); }
    public Display createDisplay() { return new WebDisplay(); }
}

interface Button { void render(); }
interface Display { void show(); }

class MobileButton implements Button { public void render() {} }
class MobileDisplay implements Display { public void show() {} }
class WebButton implements Button { public void render() {} }
class WebDisplay implements Display { public void show() {} }
