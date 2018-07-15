/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.userWebMvc.repository;

import com.spring.userWebMvc.model.User;
import java.util.List;

/**
 *
 * @author stas
 */
public interface UserRepository {

    public List<User> findAll();

    public User findById(Long id);

    public User save(User user);

    public User update(User user);

    public void deleteById(Long id);

}
