package com.wanted.preonbording_practise.theather.service.handler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Theater {

  public void enter(Audience audience, TicketSeller ticketSeller) {
    long ticketPrice = ticketSeller.sellTo(audience);
    ticketSeller.receivePay(ticketPrice);
  }
}
