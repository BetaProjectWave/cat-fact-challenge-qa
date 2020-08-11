package io.asto.app.service;

import io.asto.app.client.CatFactClient;
import io.asto.app.model.CatFact;
import io.asto.app.model.CatFactDataWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatFactService {

  private static final Logger LOG = LoggerFactory.getLogger(CatFactService.class);

  @Autowired
  private CatFactClient catFactClient;

  public List<String> getFacts(final int limit) {

    if (limit < 1) {
      throw new IllegalArgumentException("Limit must be greater than 0");
    }

    CatFactDataWrapper catFactWrapper = catFactClient.getFacts(limit);

    List<String> flattenFacts = flatten(catFactWrapper);

    return flattenFacts;
  }

  public List<String> flatten(final CatFactDataWrapper catFactWrapper) {

    LOG.info("Flattening facts: {}", catFactWrapper);

    List<String> results = new ArrayList<>();

    for (CatFact fact : catFactWrapper.getData()) {
      results.add(fact.getFact());
    }

    return results;
  }

}
