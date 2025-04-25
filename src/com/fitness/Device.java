package com.fitness.tracker;

public class Device {
    private String deviceId;
    private String status;

    public Device(String deviceId) {
        this.deviceId = deviceId;
        this.status = "Disconnected";
    }

    public void connect() {
        this.status = "Connected";
    }

    public void disconnect() {
        this.status = "Disconnected";
    }

    // Getters
    public String getDeviceId() { return deviceId; }
    public String getStatus() { return status; }
}
