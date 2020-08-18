package org.arhan.events;

import static java.time.LocalDateTime.of;

public class ExampleEvents {
    public static void main(String[] args) {
        Calendar calendar = new Calendar("My Calendar");

        Event party = new Event("Party");
        party.setDateTime(of(2018, 11, 25, 0, 0));
        calendar.addEvent(party);

        Event conference = new Event("Conference");
        party.setDateTime(of(2018, 10, 15, 0, 0));
        calendar.addEvent(conference);

        System.out.println(calendar);
    }
}
