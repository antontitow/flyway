package ru.titov.secure.config.security;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 28.07.2023, 2:46
 **/
@Configuration
@ConditionalOnProperty(value = "secure.config.switcher", havingValue = "in-db")
@RequiredArgsConstructor
public class SecureInDBConfig {


}
