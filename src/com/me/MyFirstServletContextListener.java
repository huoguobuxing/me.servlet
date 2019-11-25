package com.me;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.logging.Logger;

/**
 * servlet提供了整个web上下文变化的listener。主要包括【增删】
 */
public class MyFirstServletContextListener implements ServletContextListener {
       private Logger logger = Logger.getLogger(MyFirstServletContextListener.class.getName());


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info("当前web应用启动了。MyFirstServletContextListener.contextInitialized()");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info("当前web应用关闭了。MyFirstServletContextListener.contextDestroyed()");
    }
}
