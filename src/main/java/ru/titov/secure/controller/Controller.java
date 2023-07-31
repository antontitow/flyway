package ru.titov.secure.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.titov.secure.model.UserEntity;
import ru.titov.secure.service.UserService;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 24.07.2023, 22:33
 **/
@RequestMapping("/secure")
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class Controller {
    private final UserService userService;

    @GetMapping({"/user/{username}", "/listener/{username}"})
    ResponseEntity<String> getUser(@PathVariable String username) {
        return ResponseEntity.ok(username);
    }

    @GetMapping("/admin/{user_id}")
    ResponseEntity<UserEntity> getAdmin(@PathVariable Long user_id) {
        return ResponseEntity.ok(userService.getUser(user_id));
//        return ResponseEntity.ok(username);
    }

    @GetMapping("/all")
    ResponseEntity<String> getAll() {
        return ResponseEntity.ok("Done");
    }
}
