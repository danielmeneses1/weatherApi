package com.example.demo.repository;

import com.example.demo.domain.weatherForecast.WeatherModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWeather extends JpaRepository<WeatherModel, Long> {}
