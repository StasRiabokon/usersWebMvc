/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.userWebMvc.service;

import com.spring.userWebMvc.model.User;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author stas
 */
public interface UserService {
    
    public List<User> getAllUsers();
    
    public User getUser(Long id);
    
    public User addUser(User user); 
    
    public void deleteUser(Long id);
    
}
