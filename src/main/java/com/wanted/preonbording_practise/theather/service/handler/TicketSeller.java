package com.wanted.preonbording_practise.theather.service.handler;

public class TicketSeller {

  private final TicketOffice ticketOffice;

  public TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

  public long sellTo(Audience audience) {
    long ticketPrice = audience.buy(ticketOffice.publishTicket());
    return ticketPrice;
  }

  public void receivePay(long ticketPrice) {
    ticketOffice.increaseSalesAmount(ticketPrice);
  }

}
