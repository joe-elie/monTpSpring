package com.tpFinalSpring.gestionnaire.config;

import com.tpFinalSpring.gestionnaire.filtres.FiltrePrincipal;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigFiltrePrincipal {

    @Bean
    public FilterRegistrationBean<FiltrePrincipal> registrationBean(){

        FilterRegistrationBean<FiltrePrincipal> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new FiltrePrincipal());
        registrationBean.addUrlPatterns("/clients/*");

        return registrationBean;
    }
}
