package org.example.demo.ticket.webapp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.example.demo.ticket.business.ManagerFactory;
import org.example.demo.ticket.business.manager.ProjetManagerImpl;
import org.example.demo.ticket.business.manager.TicketManagerImpl;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

public class DependencyInjectionListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ManagerFactory managerFactory = new ManagerFactory();
        managerFactory.setTicketManager(new TicketManagerImpl());
        managerFactory.setProjetManager(new ProjetManagerImpl());
        AbstractResource.setManagerFactory(managerFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
