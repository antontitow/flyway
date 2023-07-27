package ru.titov.secure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autor : Anton Titov {@literal antontitow@bk.ru}
 * @created : 24.07.2023, 22:33
 **/
@RequestMapping("/secure")
@RestController
public class Controller {

    @GetMapping({"/user/{username}", "/listener/{username}"})
    ResponseEntity<String> getUser(@PathVariable String username) {
        return ResponseEntity.ok(username);
    }

    @GetMapping("/admin/{username}")
    ResponseEntity<String> getAdmin(@PathVariable String username) {
        return ResponseEntity.ok(username);
    }

    @GetMapping("/all")
    ResponseEntity<String> getAll() {
        return ResponseEntity.ok("Done");
    }
}
