package org.arhan.events;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

  String name;
  List<Event> events = new ArrayList<>();

  public Calendar(String name) {
    this.name = name;
  }

  public void addEvent(@NotNull Event event) {
    events.add(event);
  }


  @Override
  public String toString() {
    return "Calendar{" +
        "name='" + name + '\'' +
        ", events=" + events +
        '}';
  }
}
