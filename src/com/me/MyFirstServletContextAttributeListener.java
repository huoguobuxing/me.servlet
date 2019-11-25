package com.me;


import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import java.util.logging.Logger;

/**
 * servlet提供了整个web上下文【属性】变化的listener。主要包括【增删改】
 */
public class MyFirstServletContextAttributeListener implements ServletContextAttributeListener {

    private Logger logger = Logger.getLogger(MyFirstServletContextAttributeListener.class.getName());

    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        logger.info("当前web应用的上下文增加了属性" + servletContextAttributeEvent.getName() + "。MyFirstServletContextAttributeListener.attributeAdded()");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        logger.info("当前web应用的上下文删除了属性" + servletContextAttributeEvent.getName() + "。MyFirstServletContextAttributeListener.attributeRemoved()");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        logger.info("当前web应用的上下文修改了属性" + servletContextAttributeEvent.getName() + "。MyFirstServletContextAttributeListener.attributeReplaced()");
    }
}
