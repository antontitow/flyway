package ru.titov.secure.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 28.07.2023, 2:15
 **/
@Entity(name = "users")
@Data
public class UserEntity {
    @Id
    private Long id;
    private String login;
    private String password_hash;
}
