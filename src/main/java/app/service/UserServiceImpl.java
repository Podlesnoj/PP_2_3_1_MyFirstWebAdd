package app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import app.dao.UserDaoImpl;
import app.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDaoImpl userDaoImpl;

    public UserServiceImpl(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    @Override
    public List<User> getAllUsers() {
        return userDaoImpl.getAllUsers();
    }

    @Override
    public void saveUser(User user) {
        userDaoImpl.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDaoImpl.updateUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDaoImpl.getUserById(id);
    }

    @Override
    public void deleteUser(Long id) {
        userDaoImpl.deleteUser(id);
    }
}