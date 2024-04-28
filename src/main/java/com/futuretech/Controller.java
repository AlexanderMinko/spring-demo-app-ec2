package com.futuretech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

  @GetMapping
  String hello() {
    return "Greetings from Spring Boot!";
  }

  @GetMapping("/message")
  String message() {
    return "Опа ухилянт! Вам повісткаю З цього моменту вона вважається врученою, якщо ви не зявитесь в найближчий тцк то вам заборонять срать!";
  }
}
