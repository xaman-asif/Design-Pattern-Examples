package com.designpattern.visitor;

public interface IModemVisitor {
  void visit(Grameen grameenModem);
  void visit(Teletalk teletalkModem);
  void visit(Zoom zoomModem);
  void visit(Airtel airtelModem);
}
