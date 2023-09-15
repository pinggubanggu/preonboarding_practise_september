package com.wanted.preonbording_practise.theather.service;

import com.wanted.preonbording_practise.theather.service.handler.Audience;
import com.wanted.preonbording_practise.theather.service.handler.Bag;
import com.wanted.preonbording_practise.theather.service.handler.Theater;
import com.wanted.preonbording_practise.theather.service.handler.Ticket;
import com.wanted.preonbording_practise.theather.service.handler.TicketOffice;
import com.wanted.preonbording_practise.theather.service.handler.TicketSeller;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TheaterService {

  private final Theater theater;

  public String enter() {
    theater.enter(
      new Audience(new Bag(10000L)),
      new TicketSeller(new TicketOffice(1000000, new Ticket(5000L)))
      );
    return "you can enter theater";
  }
}
