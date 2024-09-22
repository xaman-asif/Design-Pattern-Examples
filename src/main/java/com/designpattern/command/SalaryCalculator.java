package com.designpattern.command;

import java.util.Stack;

public class SalaryCalculator {
  public double baseSalary;
  private Stack<ISalaryCalculator> _salaryCalculator = new Stack<>();
  public SalaryCalculator() {
    baseSalary = 40000;
  }

  public void calculateSalary() {
    ISalaryCalculator calculator = _salaryCalculator.pop();
    double salary = calculator.calculateSalary(baseSalary);
    System.out.println(salary);
  }

  public void addSalaryCalculator(ISalaryCalculator salaryCalculator) {
    _salaryCalculator.push(salaryCalculator);
  }
}
