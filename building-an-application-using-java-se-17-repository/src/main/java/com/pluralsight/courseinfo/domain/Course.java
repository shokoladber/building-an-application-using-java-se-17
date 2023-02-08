package com.pluralsight.courseinfo.domain;

public record Course(String id, String name, long length, String url ) {

    public Course{
        filled(id);
        filled(name);
        filled(url);
    }

    private static void filled(String str){
        if (str == null || str.isBlank()){
            throw new IllegalArgumentException("No value present!");
        }
    }

}
