package com.oris.giniyatov.repository;

import com.oris.giniyatov.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<Weather,Integer> {
    Weather findByAuthor(String author);



}
