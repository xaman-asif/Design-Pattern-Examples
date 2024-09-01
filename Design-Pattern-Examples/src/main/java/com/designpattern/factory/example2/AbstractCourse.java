package com.designpattern.factory.example2;

public abstract class AbstractCourse {
  protected String name;
  protected Double duration;

  public abstract void createCourseMaterial();
  public abstract void createCourseSchedule();
  public abstract void displayCourseDetails();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }
}
