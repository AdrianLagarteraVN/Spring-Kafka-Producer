package com.isban.gcb.confirming.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Configuración de spring security
 * 
 * @author Adrián Lagartera
 *
 */
@Configuration
public class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().permitAll().and().csrf().disable();
        // En desarrollo dejamos la seguridad en abierto, cuando se suba a pre habra que
        // seguir las directivas de seguridad
    }

}
