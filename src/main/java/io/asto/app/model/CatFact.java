package io.asto.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CatFact {

  @JsonProperty("fact")
  private String fact;

  public String getFact() {
    return fact;
  }

  public void setFact(final String fact) {
    this.fact = fact;
  }

  @Override
  public String toString() {
    return "CatFact{" +
        "fact='" + fact + '\'' +
        '}';
  }
}
