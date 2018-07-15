package com.spring.userWebMvc.service;

import com.spring.userWebMvc.model.User;
import java.util.List;

/**
 *
 * @author stas
 */
public interface UserService {

    public List<User> getAllUsers();

    public User getUser(Long id);

    public User addUser(User user);

    public User updateUser(User user);

    public void deleteUser(Long id);

}
