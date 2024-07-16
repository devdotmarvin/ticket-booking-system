package dev.marvin.model;

import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;

public class Ticket {
    private Integer ticketId;
    private BigDecimal ticketPrice;
    private TicketStatus ticketStatus;
    private Integer ticketCount;
    @ManyToOne
    private Event event;
}
