package io.asto.app.client;

import io.asto.app.model.CatFactDataWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CatFactClient {

  private static final Logger LOG = LoggerFactory.getLogger(CatFactClient.class);

  private String baseUrl;

  @Autowired
  public CatFactClient(final @Value("https://catfact.ninja") String baseUrl) {
    this.baseUrl = baseUrl;

    LOG.info("Base URL: {}", baseUrl);
  }

  public CatFactDataWrapper getFacts(final int limit) {

    LOG.info("Calling fetch cat fact");

    RestTemplate template = new RestTemplate();

    String location = baseUrl + "/facts?limit=" + limit;

    LOG.info("Using location: {}", location);

    CatFactDataWrapper response = template.getForObject(location, CatFactDataWrapper.class);

    LOG.info("Response: {}", response);

    return response;
  }

}
