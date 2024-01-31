package com.qeema.qeema_project.security;
import org.springframework.security.crypto.password.PasswordEncoder;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class secuer {
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }



    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(configurer ->
                configurer

                        .requestMatchers(HttpMethod.GET, "/api/orders/**").hasRole("USER")
                        .requestMatchers(HttpMethod.POST, "/api/user").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST, "/api/authority").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST, "/api/items").hasRole("USER")
                        .requestMatchers(HttpMethod.GET, "/api/ordersitems/**").hasRole("USER")
                        .requestMatchers(HttpMethod.GET, "/api/**").hasRole("USER")
                        .requestMatchers(HttpMethod.PUT, "/api/ordersitmesupdate").hasRole("USER")



        );

        // use HTTP Basic authentication
        http.httpBasic(Customizer.withDefaults()).addFilterBefore(new OncePerRequestFilter() {
            @Override
            protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException, ServletException, IOException {
                System.out.println(request.getRequestURI());
                filterChain.doFilter(request,response);
            }
        }, BasicAuthenticationFilter.class);

        // disable Cross Site Request Forgery (CSRF)
        // in general, not required for stateless REST APIs that use POST, PUT, DELETE and/or PATCH
        http.csrf(csrf -> csrf.disable());

        return http.build();
    }


}
