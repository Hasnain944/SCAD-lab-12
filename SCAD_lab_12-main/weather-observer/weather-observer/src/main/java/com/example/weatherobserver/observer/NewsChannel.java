package com.example.weatherobserver.observer;

public class NewsChannel implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("NewsChannel Alert: Weather changed! Temp = " + temperature + ", Humidity = " + humidity);
    }
}
