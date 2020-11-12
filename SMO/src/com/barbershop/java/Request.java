package com.barbershop.java;

public class Request {
    private int sourcePriority;
    private int requestNumber;
    private double arrivalTimeSystem;
    private double arrivalTimeBuffer;
    private double arrivalTimeDevice;
    private double exitTimeBuffer;
    private double exitTimeDevice;


    public Request(int sourcePriority, int requestNumber, double arrivalTimeSystem, double arrivalTimeBuffer, double arrivalTimeDevice, double exitTimeBuffer, double exitTimeDevice) {
        this.sourcePriority = sourcePriority;
        this.requestNumber = requestNumber;
        this.arrivalTimeSystem = arrivalTimeSystem;
        this.arrivalTimeBuffer = arrivalTimeBuffer;
        this.arrivalTimeDevice = arrivalTimeDevice;
        this.exitTimeBuffer = exitTimeBuffer;
        this.exitTimeDevice = exitTimeDevice;
    }
    public int getRequestNumber() { return requestNumber; }

    public int getSourcePriority() {
        return sourcePriority;
    }

    public double getArrivalTimeSystem() {
        return arrivalTimeSystem;
    }

    public double getArrivalTimeBuffer() {
        return arrivalTimeBuffer;
    }

    public double getArrivalTimeDevice() {
        return arrivalTimeDevice;
    }

    public double getExitTimeBuffer() {
        return exitTimeBuffer;
    }

    public double getExitTimeDevice() {
        return exitTimeDevice;
    }

    public void setSourcePriority(int sourcePriority) {
        this.sourcePriority = sourcePriority;
    }

    public void setArrivalTimeSystem(double arrivalTimeSystem) {
        this.arrivalTimeSystem = arrivalTimeSystem;
    }

    public void setArrivalTimeBuffer(double arrivalTimeBuffer) {
        this.arrivalTimeBuffer = arrivalTimeBuffer;
    }

    public void setArrivalTimeDevice(double arrivalTimeDevice) {
        this.arrivalTimeDevice = arrivalTimeDevice;
    }

    public void setExitTimeBuffer(double exitTimeBuffer) {
        this.exitTimeBuffer = exitTimeBuffer;
    }

    public void setExitTimeDevice(double exitTimeDevice) {
        this.exitTimeDevice = exitTimeDevice;
    }

    public void setRequestNumber(int requestNumber) { this.requestNumber = requestNumber; }
}
