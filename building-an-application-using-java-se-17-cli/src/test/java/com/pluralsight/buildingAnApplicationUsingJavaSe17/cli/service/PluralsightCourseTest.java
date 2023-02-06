package com.pluralsight.buildingAnApplicationUsingJavaSe17.cli.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PluralsightCourseTest {

    @ParameterizedTest
    @CsvSource(textBlock = """
            00:00:00.0, 0
            00:05:34, 5
            01:08:34.444, 68
            """)
    void durationInMinutes(String input, long expected) {
        PluralsightCourse course =
                new PluralsightCourse("id", "Test course",input, "url",false);
        assertEquals(expected, course.durationInMinutes());
    }
}