package io.asto.app;

import org.assertj.core.api.Assertions;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationTest {

  @Autowired
  private ApplicationContext context;

  @Test
  void assertContext() {

    // Junit
    Assert.assertNotNull(context);

    // Assert J
    Assertions.assertThat(context).isNotNull();

    // Ham crest
    Assert.assertThat(context, CoreMatchers.notNullValue());
  }

}