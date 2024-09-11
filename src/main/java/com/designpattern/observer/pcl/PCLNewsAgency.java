package com.designpattern.observer.pcl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PCLNewsAgency {
  private String news;
  private PropertyChangeSupport support;

  public PCLNewsAgency() {
    support = new PropertyChangeSupport(this);
  }

  public void addPropertyChangeListener(PropertyChangeListener plc) {
    support.addPropertyChangeListener(plc);
  }

  public void removePropertyChangeListener(PropertyChangeListener plc) {
    support.removePropertyChangeListener(plc);
  }

  public void setNews(String value) {
    support.firePropertyChange("news", this.news, value);
    this.news = value;
  }
}
