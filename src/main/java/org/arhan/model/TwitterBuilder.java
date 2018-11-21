package org.arhan.model;

public class TwitterBuilder {
  private String handle;

  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public Twitter build() {
    return new Twitter(handle);
  }
}
