package com.oris.giniyatov.controller;

import com.oris.giniyatov.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @GetMapping("/weather")
    public String getWeather(@RequestParam String city){
        WeatherService weatherService = new WeatherService();
        weatherService.setCityName(city);
        return String.valueOf(weatherService.getWeather());
    }
}
