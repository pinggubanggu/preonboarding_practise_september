package com.wanted.preonbording_practise.theather.service.handler;

public class Bag {

  // 돈
  private Long amount;

  private final Invitation invitation;

  private Ticket ticket;

  public Bag(long amount) {
    this(null, amount);
  }

  public Bag(Invitation invitation, long amount) {
    this.invitation = invitation;
    this.amount = amount;
  }

  public Long hold(Ticket ticket) {
    if(hasInvitation()) {
      setTicket(ticket);
      return 0L;
    } else {
      // 초대권이 없으니깐 티켓을 사야 한다.
      minusAmount(ticket);
      setTicket(ticket);
      return ticket.getFee();
    }
  }

  private boolean hasInvitation() {
    // 초대권이 null이 아니면 true 보낸다
    return invitation != null;
  }

  private void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }

  private void minusAmount(Ticket ticket) {
    // 티켓 가격만큼 빼준다.
    amount -= ticket.getFee();
  }
}
