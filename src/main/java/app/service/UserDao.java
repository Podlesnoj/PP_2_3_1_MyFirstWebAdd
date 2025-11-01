package app.service;

import app.model.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void saveUser(User user);
    void updateUser(User user);
    User getUserById(Long id);
    void deleteUser(Long id);
}