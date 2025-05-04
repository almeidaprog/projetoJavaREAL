package com.rpgsheets.controller;

import com.rpgsheets.model.User;
import com.rpgsheets.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User found = userRepository.findByUsername(user.getUsername());
        if (found != null && found.getPassword().equals(user.getPassword())) {
            return "Login bem-sucedido!";
        } else {
            return "Usuário ou senha inválidos.";
        }
    }

}
