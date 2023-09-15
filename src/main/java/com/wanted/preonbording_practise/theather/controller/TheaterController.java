package com.wanted.preonbording_practise.theather.controller;

import com.wanted.preonbording_practise.theather.service.TheaterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theater")
@RequiredArgsConstructor
public class TheaterController {

  private final TheaterService theaterService;

  @GetMapping("enter")
  public String enter() {
    return theaterService.enter();
  }
}
