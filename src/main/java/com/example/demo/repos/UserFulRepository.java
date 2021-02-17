package com.example.demo.repos;

import com.example.demo.dto.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class UserFulRepository implements UserRepository{
    @Override
    public Collection<User> loadUsers() {
        return null;
    }
}
