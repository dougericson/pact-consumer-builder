package com.github.dougericson.pact.consumer.pactbuilder.regression.generics;

/**
 * @author schuettec
 *
 */
public class Dummy {

  private String string;

  public Dummy() {
    super();
  }

  public Dummy(String string) {
    super();
    this.string = string;
  }

  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

}
