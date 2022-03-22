package hu.tichss.database.controller;


import hu.tichss.database.persistence.entity.User;
import hu.tichss.database.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping
    List<User> getAll() {
        System.out.println(userService.getAll().get(0).getName());
        return userService.getAll();
    }

    @PostMapping
    User save(final @RequestBody User user) {
        System.out.println(user.getName());
        return userService.save(user);
    }
}
