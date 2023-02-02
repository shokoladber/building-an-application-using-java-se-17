package com.pluralsight.buildingAnApplicationUsingJavaSe17.cli;

import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

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
    };

};
