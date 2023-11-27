package saptamana5.curs1.proiect.controller;

import saptamana5.curs1.proiect.model.User;
import saptamana5.curs1.proiect.service.UserService;
import saptamana5.curs1.proiect.service.UserServiceImpl;

import java.util.List;

public class UserController {

    private final UserService userService = new UserServiceImpl();


    public void addUser(User user){
        userService.addUser(user);
    }

    public User findUser(String username){
        return userService.findUser(username);
    }


    public void deleteUser (String username){
        userService.deleteUser(username);
    }

    public List<User> listAllUsers() {
        return userService.listAllUsers();
    }

    public void loginUser(User user){

    }






}
