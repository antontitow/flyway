package ru.titov.secure.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.titov.secure.model.UserEntity;
import ru.titov.secure.repository.UserRepository;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 28.07.2023, 2:23
 **/
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserEntity getUser(Long id) {
        return userRepository.getById(id);
    }
}
