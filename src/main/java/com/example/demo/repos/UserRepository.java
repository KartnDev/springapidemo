package com.example.demo.repos;

import com.example.demo.dto.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository {
    Collection<User> loadUsers();

}
