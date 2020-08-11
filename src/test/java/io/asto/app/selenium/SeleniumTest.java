package io.asto.app.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static java.lang.String.format;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) // Comment out to disable booting app
class SeleniumTest {

  @Value("${local.server.port:8080}")
  public int randomServerPort;

  @Test
  void titleNotEmpty() {

    // Download chrome driver
    WebDriverManager.getInstance(DriverManagerType.CHROME).setup();

    WebDriver driver = new ChromeDriver();

    //Load the main website
    driver.get(format("http://localhost:%d", randomServerPort));

    String title = driver.getTitle();

    Assertions.assertThat(title).isNotNull();

    driver.quit();
  }

}