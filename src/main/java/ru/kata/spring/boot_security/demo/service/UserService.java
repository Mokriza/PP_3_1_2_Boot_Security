package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findOne(Long id);

    boolean save(User user);

    void update(Long id, User updatedUser);

    void delete(Long id);
}
