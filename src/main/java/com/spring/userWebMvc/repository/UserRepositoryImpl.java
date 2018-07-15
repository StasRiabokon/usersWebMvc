package com.spring.userWebMvc.repository;

import com.spring.userWebMvc.model.User;
import java.io.Serializable;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stas
 */
@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {

    @Autowired(required = false)
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<User> findAll() {
        return currentSession().createQuery("FROM User").list();

    }

    @Override
    public User findById(Long id) {
        return currentSession().get(User.class, id);
    }

    @Override
    public User save(User user) {
        Serializable id = currentSession().save(user);
        return new User((Long) id, user.getFirstname(), user.getLastname(), user.getBirth(),
                user.getLogin(), user.getPassword(), user.getAbout(), user.getAddress(), user.getEmail());
    }

    @Override
    public User update(User user) {
        return (User) currentSession().merge(user);
    }

    @Override
    public void deleteById(Long id) {
        currentSession().delete(findById(id));

    }

}
