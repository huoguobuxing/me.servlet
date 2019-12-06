package com.me;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.Logger;

public class FirstFilter1 implements Filter {
    private Logger logger = Logger.getLogger(FirstFilter1.class.getName());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("filter1开始初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("filter1开始执行");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        logger.info("filter1开始销毁");
    }
}
