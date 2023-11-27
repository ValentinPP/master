package saptamana5.curs1.proiect.repository;

import saptamana5.curs1.proiect.model.User;

import java.util.List;

public interface UserRepository {

    void addUser(User user);

    User findUser(String username);

    void deleteUser(User user);

    List<User> listAllUsers();


}
