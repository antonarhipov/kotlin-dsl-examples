package org.arhan.events;

import java.time.LocalDateTime;

public class ExampleEvents {
  public static void main(String[] args) {
    Calendar calendar = new Calendar("My Calendar");

    Event party = new Event("Party");
    party.setDateTime(LocalDateTime.of(2018, 11, 25, 0, 0));
    calendar.addEvent(party);

    Event conference = new Event("Conference");
    party.setDateTime(LocalDateTime.of(2018, 10, 15, 0, 0));
    calendar.addEvent(conference);

    System.out.println(calendar);
  }
}
