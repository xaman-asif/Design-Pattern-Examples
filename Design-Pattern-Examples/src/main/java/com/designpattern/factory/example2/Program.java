package com.designpattern.factory.example2;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    AbstractCourse abstractCourse = CourseFactory.createCourse("ONet");
    abstractCourse.displayCourseDetails();
  }
}
