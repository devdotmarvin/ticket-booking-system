package dev.marvin.model;

import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Ticket {
    private Integer ticketId;
    private BigDecimal ticketPrice;
    private TicketStatus ticketStatus;
    private Integer ticketCount;
    @ManyToOne
    private Event event;
}
