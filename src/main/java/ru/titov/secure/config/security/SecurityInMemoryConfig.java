package ru.titov.secure.config.security;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 24.07.2023, 22:55
 **/
@Configuration
@ConditionalOnProperty(value = "secure.config.switcher", havingValue = "in-memory")
public class SecurityInMemoryConfig {

    @Bean
    public UserDetailsManager userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build());

        manager.createUser(User.withDefaultPasswordEncoder()
                .username("user2")
                .password("password")
                .roles("USER")
                .build());

        return manager;
    }
}
