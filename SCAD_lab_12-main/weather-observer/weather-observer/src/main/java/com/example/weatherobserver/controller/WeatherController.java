package com.example.weatherobserver.controller;

import com.example.weatherobserver.observer.*;
import com.example.weatherobserver.subject.WeatherStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired private WeatherStation weatherStation;
    @Autowired private DigitalDisplay digitalDisplay;
    @Autowired private StatisticsBoard statisticsBoard;
    @Autowired private MobileAlertSystem mobileAlertSystem;

    @PostMapping("/update")
    public String updateWeather(@RequestParam float temperature, @RequestParam float humidity) {
        // Register observers
        weatherStation.registerObserver(digitalDisplay);
        weatherStation.registerObserver(statisticsBoard);
        weatherStation.registerObserver(mobileAlertSystem);

        // Dynamically add NewsChannel observer
        weatherStation.registerObserver(new NewsChannel());

        // Trigger weather update
        weatherStation.setMeasurements(temperature, humidity);

        return "Weather updated and observers notified!";
    }
}
