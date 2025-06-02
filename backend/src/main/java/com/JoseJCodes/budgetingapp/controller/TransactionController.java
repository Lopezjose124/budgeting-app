package com.JoseJCodes.budgetingapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

  private final TransactionService service;

  public TransactionController(TransactionService service) {
    this.service = service;
  }

  @GetMapping
  public List<Transaction> getAllTransactions() {
    return service.getAll();
  }

  @PostMapping
  public Transaction create(@RequestBody Transaction transaction) {
    return service.save(transaction);
  }
}
