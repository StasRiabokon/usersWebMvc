/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.userWebMvc.config;

import com.spring.userWebMvc.controller.UserController;
import com.spring.userWebMvc.repository.UserRepository;
import com.spring.userWebMvc.repository.UserRepositoryImpl;
//import com.spring.userWebMvc.repository.UserRepositoryImpl;
import com.spring.userWebMvc.service.UserService;
import com.spring.userWebMvc.service.UserServiceImpl;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author stas
 */
@Configuration
public class AppConfig {

    @Bean
    public UserController getUserController() {
        return new UserController(getUserService());
    }

    @Bean
    public UserService getUserService() {
        return new UserServiceImpl(getUserRepository());
    }

    @Bean
    public UserRepository getUserRepository() {
        return new UserRepositoryImpl();
    }
}
