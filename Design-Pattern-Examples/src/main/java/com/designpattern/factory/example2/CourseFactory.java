package com.designpattern.factory.example2;

public class CourseFactory {
  public static AbstractCourse createCourse(String courseName) {
    AbstractCourse abstractCourse = null;

    if (courseName.equalsIgnoreCase("ONet")) {
      abstractCourse = new ONet();
    } else if (courseName.equalsIgnoreCase("OJava")) {
      abstractCourse = new OJava();
    }

    abstractCourse.createCourseMaterial();
    abstractCourse.createCourseSchedule();
    return abstractCourse;
  }
}
