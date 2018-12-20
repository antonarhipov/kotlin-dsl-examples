package org.arhan.model;

import java.time.LocalDate;

public class Client {
  private final String myFirstName;
  private final String myLastName;
  private final Company myCompany;
  private final Twitter myTwitter;

  private LocalDate dob;

  public Client(String firstName, String lastName, Company company, Twitter twitter) {
    myFirstName = firstName;
    myLastName = lastName;
    myCompany = company;
    myTwitter = twitter;
  }

  public String getFirstName() {
    return myFirstName;
  }

  public String getLastName() {
    return myLastName;
  }

  public Company getCompany() {
    return myCompany;
  }

  public Twitter getTwitter() {
    return myTwitter;
  }

  public String getHelloMessage() {
    return "Foo";
  }

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }
}
