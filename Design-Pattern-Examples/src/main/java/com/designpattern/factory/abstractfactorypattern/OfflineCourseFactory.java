package com.designpattern.factory.abstractfactorypattern;

public class OfflineCourseFactory extends AbstractCourseFactory {
  @Override
  protected AbstractCourse getCourse(String courseName) {
    AbstractCourse abstractCourse = null;

    if (courseName.equalsIgnoreCase("CJava")) {
      abstractCourse = new CJava();
    } else if (courseName.equalsIgnoreCase("CNet")) {
      abstractCourse = new CNet();
    }

    return abstractCourse;
  }
}
