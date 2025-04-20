package com.example.weatherobserver.observer;

import org.springframework.stereotype.Component;

@Component
public class MobileAlertSystem implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Mobile Alert: Temp = " + temperature + ", Humidity = " + humidity);
    }
}
