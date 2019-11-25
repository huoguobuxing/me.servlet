package com.me;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import java.util.logging.Logger;

/**
 * servlet提供了请求【属性】变化的listener。主要包括【增删改】
 */
public class MyFirstServletRequestAttributeListener implements ServletRequestAttributeListener {
    private Logger logger = Logger.getLogger(MyFirstServletRequestAttributeListener.class.getName());

    @Override
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        logger.info("当前请求的上下文增加了属性" + servletRequestAttributeEvent.getName() + "。MyFirstServletRequestAttributeListener.attributeAdded()");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        logger.info("当前请求的上下文增加了属性" + servletRequestAttributeEvent.getName() + "。MyFirstServletRequestAttributeListener.attributeRemoved()");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        logger.info("当前请求的上下文增加了属性" + servletRequestAttributeEvent.getName() + "。MyFirstServletRequestAttributeListener.attributeReplaced()");
    }
}
