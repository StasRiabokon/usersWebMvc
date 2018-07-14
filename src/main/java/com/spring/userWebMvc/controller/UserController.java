/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.userWebMvc.controller;

import com.spring.userWebMvc.model.User;
import com.spring.userWebMvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author stas
 */
@Controller
public class UserController {

    @Autowired(required = false)
    private UserService service;

    @GetMapping("/users/add")
    public String createUser(Model model) {
        model.addAttribute("user", new User());
        return "edit";
    }

    @PostMapping("/users")
    public String saveUser(User user) {
        service.addUser(user);
        return "redirect:/users";
    }

    @GetMapping(value = {"/", "/users"})
    public String getAllUsers(Model model) {
        model.addAttribute("users", service.getAllUsers());
        return "users";
    }

    @GetMapping("/users/edit/{id}")
    public String editUser(Model model, @PathVariable Long id) {
        model.addAttribute("user", service.getUser(id));
        return "edit";
    }

    @GetMapping("/users/{id}")
    public String getUser(Model model, @PathVariable Long id) {
        model.addAttribute("user", service.getUser(id));
        return "show-info";
    }

    @PostMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
        return "redirect:/users";
    }
}
