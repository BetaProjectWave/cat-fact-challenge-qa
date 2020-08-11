package io.asto.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class Application {

  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
