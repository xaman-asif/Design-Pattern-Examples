package com.designpattern.factory.example2;

public class ONet extends AbstractCourse {

  public ONet() {
    name = "Online .Net";
    duration = 1.30;
  }

  @Override
  public void createCourseMaterial() {
    System.out.println("Creating Online Course Material for .NET");
  }

  @Override
  public void createCourseSchedule() {
    System.out.println("Creating Online Course Schedule for .NET");
  }

  @Override
  public void displayCourseDetails() {
    System.out.println("Course Name: " + name + " Duration: " + duration + " hour");
  }
}
