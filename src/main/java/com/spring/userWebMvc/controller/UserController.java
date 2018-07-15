package com.spring.userWebMvc.controller;

import javax.validation.Valid;
import com.spring.userWebMvc.model.User;
import com.spring.userWebMvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
        return "add";
    }

    @PostMapping("/users/save")
    public String saveUser(@ModelAttribute @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "redirect:/index";
        }
        service.addUser(user);
        return "redirect:/users";
    }

    @PostMapping("/users/update")
    public String updateUser(@ModelAttribute @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "redirect:/index";
        }
        service.updateUser(user);
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
