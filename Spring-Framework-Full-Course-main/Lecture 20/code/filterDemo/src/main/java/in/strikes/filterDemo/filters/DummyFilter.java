package in.strikes.filterDemo.filters;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

public class DummyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain)
            throws IOException, ServletException {

        HttpServletRequest httpServletRequest =
                (HttpServletRequest) servletRequest;

        String uri = httpServletRequest.getRequestURI();

        if(!uri.startsWith("/api/")) {
            filterChain.doFilter(servletRequest, servletResponse);
        }

        System.out.println("Dummy filter called");

        filterChain.doFilter(servletRequest, servletResponse);

    }
}