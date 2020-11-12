package com.barbershop.java;

public class Source {
    private int priority;
    private double interval;
    private double lambda;
    private int requestsCount;

    public Source(int priority, double lambda) {
        this.priority = priority;
        this.lambda = lambda;
    }

    public Request generate(){

    }

    //вычисляем интервал между генерацией заявок
    public double calcInterval(double lambda){
        if (interval <= 0){
            requestsCount++; //появилась заявка => добавили в общее число
            interval = (- 1/lambda)*Math.log(Math.random()); //вычислили время ожидания следующей заявки
        }
        return interval;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public double getInterval() {
        return interval;
    }

//    public void setInterval(double interval) {
//        this.interval = interval;
//    }


}
