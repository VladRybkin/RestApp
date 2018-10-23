package ua.training.service.impl;

import ua.training.model.User;
import ua.training.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    private List<User> users = new ArrayList<>();

    public UserServiceImpl() {
        users.add(new User(1, "vlad"));
        users.add(new User(2, "Oleg"));
    }

    @Override
    public void addUser(User user) {
        user.setId(users.size() + 1);
        user.setName("user " + users.size() + 1);
        users.add(user);
    }

    @Override
    public void deleteUser(long id) {
        users.remove(id);
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }

    @Override
    public void updateUser(int id, User user) {
        users.set(id, user);
    }
}
