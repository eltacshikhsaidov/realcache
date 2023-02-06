package io.shixseyidrin.realcache.controller;

import io.shixseyidrin.realcache.model.User;
import io.shixseyidrin.realcache.response.Result;
import io.shixseyidrin.realcache.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping(path = "/save")
    public Result<?> saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping(path = "/all")
    public Result<?> allUsers() {
        return userService.allUsers();
    }
}
