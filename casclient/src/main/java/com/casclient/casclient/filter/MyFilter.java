package com.casclient.casclient.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author leo_Yang【音特】
 * @Date 2018/1/19 0019 10:00
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init方法");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter方法");
    }

    @Override
    public void destroy() {
        System.out.println("destroy方法");
    }
}
