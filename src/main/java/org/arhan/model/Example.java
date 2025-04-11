package org.arhan.model;

public class Example {
  public static void main(String[] args) {
    final ClientBuilder builder = new ClientBuilder();

    builder.setFirstName("Anton");
    builder.setLastName("Arhipov");

    final TwitterBuilder twitterBuilder = new TwitterBuilder();
    twitterBuilder.setHandle("@antonarhipov");
    builder.setTwitter(twitterBuilder.build());

    final CompanyBuilder companyBuilder = new CompanyBuilder();
    companyBuilder.setName("JetBrains");
    companyBuilder.setCity("Tallinn");
    builder.setCompany(companyBuilder.build());

    final Client client = builder.build();
    System.out.println("Created client is: " + client);
  }
}










