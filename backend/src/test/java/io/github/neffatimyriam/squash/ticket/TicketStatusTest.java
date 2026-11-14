package io.github.neffatimyriam.squash.ticket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TicketStatusTest {

    @Test
    void hasExactlyTheExpectedValuesInOrder() {
        TicketStatus[] expected = {TicketStatus.OPEN, TicketStatus.IN_PROGRESS, TicketStatus.RESOLVED};

        assertArrayEquals(expected, TicketStatus.values());
    }
}