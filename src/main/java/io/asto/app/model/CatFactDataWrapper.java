package io.asto.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CatFactDataWrapper {

  @JsonProperty("data")
  private List<CatFact> data;

  public List<CatFact> getData() {
    return data;
  }

  public void setData(final List<CatFact> data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "CatFactDataWrapper{" +
        "data=" + data +
        '}';
  }
}
