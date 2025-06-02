package com.JoseJCodes.budgetingapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@RequestMapping("/api/health")
public class HealthCheckController {
  @GetMapping
  public String health() {
    return "OK";
  }
}
