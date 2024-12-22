package com.interview.test_show.service;

import java.util.List;
import java.util.Optional;

import com.interview.test_show.entity.User;

public interface UserService {


    public List<User> getAllUsers();

    public Optional<User> getUserById(Long id);

    public User createUser(User user) ;

    public User updateUser(Long id, User updatedUser);

    public void deleteUser(Long id) ;
}

