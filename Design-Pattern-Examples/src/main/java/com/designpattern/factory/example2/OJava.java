package com.designpattern.factory.example2;

public class OJava extends AbstractCourse {

  public OJava() {
    name = "Online Java";
    duration = 2.00;
  }

  @Override
  public void createCourseMaterial() {
    System.out.println("Creating Online Course Material for Java");
  }

  @Override
  public void createCourseSchedule() {
    System.out.println("Creating Online Course Schedule for Java");
  }

  @Override
  public void displayCourseDetails() {
    System.out.println("Course Name: " + name + " Duration: " + duration + " hour");
  }
}
