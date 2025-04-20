package com.example.weatherobserver.observer;

import org.springframework.stereotype.Component;

@Component
public class DigitalDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Digital Display: Temp = " + temperature + ", Humidity = " + humidity);
    }
}
