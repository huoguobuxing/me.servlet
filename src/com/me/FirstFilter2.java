package com.me;

import javax.servlet.*;
import java.io.IOException;
import java.util.logging.Logger;

public class FirstFilter2 implements Filter {
    private Logger logger = Logger.getLogger(FirstFilter2.class.getName());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("filter2开始初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("filter2开始执行");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        logger.info("filter2开始销毁");
    }
}