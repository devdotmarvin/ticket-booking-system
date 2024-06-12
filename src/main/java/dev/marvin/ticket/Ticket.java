package dev.marvin.ticket;

import dev.marvin.event.Event;
import dev.marvin.user.User;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.math.BigDecimal;

public class Ticket {
    private Integer id;
    private BigDecimal price;
    private TicketStatus ticketStatus;

    @DBRef
    private Event event;

    private User user;

}
