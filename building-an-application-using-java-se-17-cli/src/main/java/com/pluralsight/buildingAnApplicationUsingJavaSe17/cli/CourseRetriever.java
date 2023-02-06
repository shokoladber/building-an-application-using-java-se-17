package com.pluralsight.buildingAnApplicationUsingJavaSe17.cli;

import com.pluralsight.buildingAnApplicationUsingJavaSe17.cli.service.CourseRetrievalService;
import com.pluralsight.buildingAnApplicationUsingJavaSe17.cli.service.PluralsightCourse;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CourseRetriever {

    public static final org.slf4j.Logger LOG = LoggerFactory.getLogger(CourseRetriever.class);

    public static void main(String[] args){
        LOG.info("CourseRetriever starting");
        if (args.length==0){
            LOG.warn("Please provide an author name as first argument.");
            return;
        };

        try{
            retrieveCourses(args[0]);
        } catch (Exception exception) {
            LOG.error("Unexpected error", exception);
        };

    }

    private static void retrieveCourses(String authorId) {

        LOG.info("Retrieving courses for author '{}'", authorId);
        CourseRetrievalService courseRetrievalService = new CourseRetrievalService();

        List<PluralsightCourse> coursesToStore = courseRetrievalService.getCoursesFor(authorId)
                .stream()
                .filter(course -> !course.isRetired())
                .toList();
        LOG.info("Retrieved the following {} courses {}", coursesToStore.size(), coursesToStore);

    };

};
