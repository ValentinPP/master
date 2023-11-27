package saptamana5.curs1.proiect.service;

import saptamana5.curs1.proiect.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    User findUser(String username);

    void deleteUser(String username);

    List<User> listAllUsers();


    void loginUser(User user);

}
