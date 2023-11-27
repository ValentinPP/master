package saptamana5.curs1.proiect.repository;

import saptamana5.curs1.proiect.databse.Database;
import saptamana5.curs1.proiect.model.User;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private final Database database = new Database();

    @Override
    public void addUser(User user) {
        database.userList.add(user);
    }

    @Override
    public User findUser(String username) {
        for(User u: database.userList){
            if(username.equals(u.getUsername())){
                return u;
            }
        }

        return null;
    }

    @Override
    public void deleteUser(User user) {
        database.userList.remove(user);
    }

    @Override
    public List<User> listAllUsers() {
        return database.userList;
    }


}
