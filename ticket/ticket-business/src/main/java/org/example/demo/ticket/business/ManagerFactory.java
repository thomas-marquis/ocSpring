package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public final class ManagerFactory {

    private static final ManagerFactory INSTANCE = new ManagerFactory();

    private ProjetManager projetManager;

    private TicketManager ticketManager;

    public static ManagerFactory getInstance() {
        return INSTANCE;
    }

    public ProjetManager getProjetManager() {
        return projetManager;
    }

    public void setProjetManager(ProjetManager projetManager) {
        this.projetManager = projetManager;
    }

    public TicketManager getTicketManager() {
        return ticketManager;
    }

    public void setTicketManager(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }
}
