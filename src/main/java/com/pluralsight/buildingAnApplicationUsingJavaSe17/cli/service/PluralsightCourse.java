package com.pluralsight.buildingAnApplicationUsingJavaSe17.cli.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PluralsightCourse(String id, String title, String duration, String contentUrl, Boolean isRetired) {
}
