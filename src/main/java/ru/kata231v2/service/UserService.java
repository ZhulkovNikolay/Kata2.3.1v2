package ru.kata231v2.service;

import ru.kata231v2.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUSer(User user);

    public User getUser(int id);

    public void deleteUser(int id);

}
