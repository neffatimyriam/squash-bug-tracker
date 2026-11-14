package io.github.neffatimyriam.squash.ticket;

public class Ticket {

    private final long id;
    private final String title;
    private final String description;
    private final TicketStatus status;
    private final TicketPriority priority;

    public Ticket(long id, String title, String description) {
        this(id, title, description, TicketPriority.MEDIUM);
    }

    public Ticket(long id, String title, String description, TicketPriority priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = TicketStatus.OPEN;
        this.priority = priority;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public TicketPriority getPriority() {
        return priority;
    }
}