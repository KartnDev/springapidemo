package com.example.demo.repos;

import com.example.demo.dto.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Repository
public class UserFulRepository implements UserRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Collection<User> loadUsers() {
        return entityManager
                .createQuery("select e from User e", User.class)
                .getResultList();
    }
}
