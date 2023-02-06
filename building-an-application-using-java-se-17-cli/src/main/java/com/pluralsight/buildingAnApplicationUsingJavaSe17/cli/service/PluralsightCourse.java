package com.pluralsight.buildingAnApplicationUsingJavaSe17.cli.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.Duration;
import java.time.LocalTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PluralsightCourse(String id, String title, String duration, String contentUrl, Boolean isRetired) {

    public long durationInMinutes(){
        return Duration.between(
                LocalTime.MIN,
                LocalTime.parse(duration())
        ).toMinutes();
    };

}
