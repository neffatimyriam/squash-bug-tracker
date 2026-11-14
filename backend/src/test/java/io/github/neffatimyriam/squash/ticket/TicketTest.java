package io.github.neffatimyriam.squash.ticket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicketTest {

    @Test
    void newTicketExposesItsIdTitleAndDescription() {
        Ticket ticket = new Ticket(1L, "Login button broken", "Nothing happens when clicking Login");

        assertEquals(1L, ticket.getId());
        assertEquals("Login button broken", ticket.getTitle());
        assertEquals("Nothing happens when clicking Login", ticket.getDescription());
    }
}