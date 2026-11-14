package io.github.neffatimyriam.squash.ticket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TicketPriorityTest {

    @Test
    void hasExactlyTheExpectedValuesInOrder() {
        TicketPriority[] expected = {TicketPriority.LOW, TicketPriority.MEDIUM, TicketPriority.HIGH};

        assertArrayEquals(expected, TicketPriority.values());
    }
}