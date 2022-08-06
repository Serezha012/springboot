package ru.seleznev.spring.service;

import ru.seleznev.spring.model.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();

    User getUserById(int id);

    void save(User user);

    void update(int id, User user);

    void delete(int id);

}
