package com.example.weatherobserver.observer;

import org.springframework.stereotype.Component;

@Component
public class StatisticsBoard implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Statistics Board: Analyzing temp = " + temperature + ", humidity = " + humidity);
    }
}
