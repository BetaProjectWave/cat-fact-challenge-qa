package io.asto.app.cucumber.step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleStep {

  private static final Logger LOG = LoggerFactory.getLogger(ExampleStep.class);

  @Given("example with {word}")
  public void givenExample(final String value) {
    LOG.info("Given: {}", value);
  }

  @When("^example for when$")
  public void whenExample() {
    LOG.info("When");
  }

  @Then("^example for then")
  public void thenExample() {
    LOG.info("Then");
  }

}
