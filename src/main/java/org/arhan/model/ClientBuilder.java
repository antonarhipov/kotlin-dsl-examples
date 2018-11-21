package org.arhan.model;

import org.jetbrains.annotations.NotNull;

public class ClientBuilder {
  private String myFirstName;
  private String myLastName;
  private Company myCompany;
  private Twitter myTwitter;

  public String getFirstName() {
    return myFirstName;
  }

  public void setFirstName(String firstName) {
    myFirstName = firstName;
  }

  public String getLastName() {
    return myLastName;
  }

  public void setLastName(String lastName) {
    myLastName = lastName;
  }

  public Company getCompany() {
    return myCompany;
  }

  public void setCompany(Company company) {
    myCompany = company;
  }

  public Twitter getTwitter() {
    return myTwitter;
  }

  public void setTwitter(Twitter twitter) {
    myTwitter = twitter;
  }


  @NotNull
  public Client build() {
    return new Client(myFirstName, myLastName, myCompany, myTwitter);
  }
}
