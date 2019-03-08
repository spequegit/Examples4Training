package com.speque.springsecurity;


import org.springframework.boot.autoconfigure.security.servlet.SpringBootWebSecurityConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.function.Function;

@Configuration
public class HelloConfiguration extends WebSecurityConfigurerAdapter {


//    @Bean
//    public UserDetailsService userDetailsService(){
//        UserDetails u = User.withDefaultPasswordEncoder()
//                .username("admin1")
//                .password("admin1")
//                .roles("role1")
//                .build();
//        return new InMemoryUserDetailsManager(u);
//    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser("admin2")
                .password(encoder.encode("admin2"))
                .roles("USER");
    }

}
