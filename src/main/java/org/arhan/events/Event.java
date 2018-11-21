package org.arhan.events;


import java.time.LocalDateTime;

public class Event {

  private String name;
  private LocalDateTime dateTime;

  public Event(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  @Override
  public String toString() {
    return "Event{" +
        "name='" + name + '\'' +
        ", dateTime=" + dateTime +
        '}';
  }
}