package io.asto.app.controller;

import io.asto.app.service.CatFactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class CatFactController {

  @Autowired
  private CatFactService service;

  @GetMapping("/facts")
  public ResponseEntity<List<String>> getFacts(final @RequestParam(required = false) Integer limit) {

    if(limit == null) {
      throw new IllegalArgumentException("Limit must be provided");
    }

    List<String> facts = service.getFacts(limit);

    return ResponseEntity.ok(facts);
  }
}
