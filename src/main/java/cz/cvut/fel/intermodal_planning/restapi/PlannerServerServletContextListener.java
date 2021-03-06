package cz.cvut.fel.intermodal_planning.restapi;

import cz.cvut.fel.intermodal_planning.planner.PlannerInitializer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.logging.Logger;

/**
 * Created by Ondrej Prenek on 27/10/2017
 */
@WebListener
public class PlannerServerServletContextListener implements ServletContextListener {
    private static final Logger log = Logger.getLogger(PlannerServerServletContextListener.class.getName());

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("Call contextInitialized(...) method.");
        PlannerInitializer.getKnownInstance();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        log.info("Call contextDestroyed(...) method.");
    }
}
