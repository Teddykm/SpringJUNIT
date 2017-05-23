package com.udemy.ticketing.dao;


import com.udemy.ticketing.dto.Ticket;
import org.springframework.stereotype.Component;

@Component
public class TicketDAOImpl implements TicketDAO {

    public int createTicket(Ticket ticket) {
        return 1;
    }
}
