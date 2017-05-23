package com.udemy.ticketing.service;


import com.udemy.ticketing.dao.TicketDAO;
import com.udemy.ticketing.dto.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketServiceDAOImpl implements TicketServiceDAO{

    @Autowired
    private TicketDAO ticketDAO;

    public int buyticket(String passengerName, String phone) {

        Ticket ticket = new Ticket();
        ticket.setPassengerName(passengerName);
        ticket.setPhone(phone);
        return ticketDAO.createTicket(ticket);
    }

    public TicketDAO getTicketDAO() {
        return ticketDAO;
    }

    public void setTicketDAO(TicketDAO ticketDAO) {
        this.ticketDAO = ticketDAO;
    }
}
