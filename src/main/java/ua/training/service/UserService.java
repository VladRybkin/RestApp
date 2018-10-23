package ua.training.service;

import ua.training.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(long id);
    void updateUser(int id, User user);
    List<User>findAllUsers();

}
