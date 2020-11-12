package com.barbershop.java;

public class Device {
    private int priority;
    private double serviceTime;

    public Device(int priority, double serviceTime) {
        this.priority = priority;
        this.serviceTime = serviceTime;
    }

    public boolean isBusy(){}
    public void serviceRequest(Request){}
    public double calcServiceTime(){}

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public double getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(double serviceTime) {
        this.serviceTime = serviceTime;
    }


