package com.designpattern.visitor;

public interface IModem {
  void connect();
  void disconnect();
  void accept(IModemVisitor modemVisitor);
}
