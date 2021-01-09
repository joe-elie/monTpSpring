package com.tpFinalSpring.gestionnaire.filtres;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
@Order(2)
public class FiltrePrincipal implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        System.out.println("Appel du filtre principal");
        filterChain.doFilter(servletRequest, servletResponse);

    }
}
