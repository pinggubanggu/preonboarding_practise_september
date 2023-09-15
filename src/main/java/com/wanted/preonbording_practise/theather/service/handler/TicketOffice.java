package com.wanted.preonbording_practise.theather.service.handler;

import java.util.ArrayList;

public class TicketOffice {

  private long amount;

  private ArrayList<Ticket> tickets;

  public TicketOffice(long amount, Ticket ticket) {
    this.amount = amount;
    this.tickets.add(ticket);
  }

  public Ticket publishTicket() {
    return getTicket();
  }

  public void increaseSalesAmount(long amount){
    plusAmount(amount);
  }

  public Ticket getTicket() {
    return tickets.get(0);
  }

  public void plusAmount(long amount) {
    this.amount += amount;
  }
}
