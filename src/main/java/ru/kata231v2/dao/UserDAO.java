package ru.kata231v2.dao;

import ru.kata231v2.entity.User;
import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
