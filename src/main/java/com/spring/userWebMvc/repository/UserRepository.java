/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.userWebMvc.repository;

import com.spring.userWebMvc.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stas
 */
@Repository
public interface UserRepository {

    public List<User> findAll();

    public User findById(Long id);

    public User save(User user);

    public void deleteById(Long id);

}
