package com.melita.melitatest.broker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/broker")
public class BrokerController {
  
  @Autowired
  private QueueSender queueSender;

  @GetMapping
  public String send() {
    queueSender.send("Testing broker");
    return "ok. done";
  }

}
