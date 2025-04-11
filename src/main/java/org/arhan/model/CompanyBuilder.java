package org.arhan.model;

public class CompanyBuilder {
  private String myName;
  private String myCity;

  public String getName() {
    return myName;
  }

  public void setName(String name) {
    this.myName = name;
  }

  public String getCity() {
    return myCity;
  }

  public void setCity(String city) {
    myCity = city;
  }

  public Company build() {
    return new Company(myName, myCity);
  }
}
