package com.udemy.ticketing.service;


import com.udemy.ticketing.dao.TicketDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context.xml")
public class TicketingServiceDAOImplTest {

    @Autowired
    @InjectMocks
    private TicketServiceDAOImpl sut;

    @Mock
    private TicketDAO ticketDAO;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void buy_ticket_should_return_the_right_value() {
        when(ticketDAO.createTicket(any())).thenReturn(1);
        int result = sut.buyticket("teddy", "07427488460");
        Assert.assertEquals(result, 1);

    }
}
