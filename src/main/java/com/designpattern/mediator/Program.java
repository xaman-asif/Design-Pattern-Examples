package com.designpattern.mediator;

public class Program {
  public static void main(String[] args) {
    var personOne = new UserOne("Moin");
    personOne.setMessage("Hi Sujon, How are you?");

    var personTwo = new UserTwo("Sujon");
    personTwo.setMessage("I am fine, but where is my money?");

    personOne.sendMessage(personTwo);
    personTwo.sendMessage(personOne);
  }
}
