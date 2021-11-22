package ru.itmo.sbdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itmo.sbdemo.entities.User;
import ru.itmo.sbdemo.repo.SessionRepo;
import ru.itmo.sbdemo.repo.UserRepo;

import java.util.ArrayList;

@Controller
@RequestMapping("users")
public class UserController {
    private SessionRepo sessionRepo;
    private UserRepo userRepo;

    public UserController(final SessionRepo sessionRepo, final UserRepo userRepo) {
        this.sessionRepo = sessionRepo;
        this.userRepo = userRepo;

        userRepo.save(new User("Vasya", "password"));
        userRepo.save(new User("Vanya", "password"));
        userRepo.save(new User("Asya", "password"));
        userRepo.save(new User("Vasyan", "password"));
        userRepo.save(new User("Serega", "password"));
    }

    @GetMapping
    public String getUsers(@ModelAttribute("users") ArrayList<User> users) {
        userRepo.findAll().forEach(users::add);
        return "listusers";
    }


}
