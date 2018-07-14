/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.userWebMvc.repository;

import com.spring.userWebMvc.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stas
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public List<User> findAll() {
        User user = new User();
        user.setAbout("about");
        user.setAddress("address");
        user.setBirth(new Date());
        user.setEmail("email");
        user.setFirstname("fistname");
        user.setId(1L);
        user.setLastname("lastname");
        user.setLogin("login");
        user.setPassword("pass");
        return new ArrayList<>(Arrays.asList(user));
    }

    @Override
    public User findById(Long id) {
        User user = new User();
        user.setAbout("about");
        user.setAddress("address");
        user.setBirth(new Date());
        user.setEmail("email");
        user.setFirstname("fistname");
        user.setId(1L);
        user.setLastname("lastname");
        user.setLogin("login");
        user.setPassword("pass");
        return user;
    }

    @Override
    public User save(User user) {
        return user;
    }

    @Override
    public void deleteById(Long id) {

    }

}
