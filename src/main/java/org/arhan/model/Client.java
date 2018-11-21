package org.arhan.model;

import org.jetbrains.annotations.NotNull;

public class Client {
  private final String myFirstName;
  private final String myLastName;
  private final Company myCompany;
  private final Twitter myTwitter;

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

}
