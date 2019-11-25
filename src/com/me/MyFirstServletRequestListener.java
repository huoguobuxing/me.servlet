package com.me;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import java.util.logging.Logger;

/**
 * servlet提供了请求变化的listener。主要包括【增删】
 */
public class MyFirstServletRequestListener implements ServletRequestListener {
    private Logger logger = Logger.getLogger(MyFirstServletRequestListener.class.getName());

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        logger.info("请求结束了。MyFirstServletRequestListener.requestDestroyed()");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        logger.info("有新请求了。MyFirstServletRequestListener.requestInitialized()");
    }
}
