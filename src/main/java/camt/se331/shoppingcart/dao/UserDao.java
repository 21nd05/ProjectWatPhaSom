package camt.se331.shoppingcart.dao;

import camt.se331.shoppingcart.entity.User;

import java.util.List;

/**
 * Created by pan on 5/15/2016.
 */
public interface UserDao {
    List<User> findAll();
    User findByUserName(String username);
    List<User> getUsers();
    List<User> getUsersByName(String name);
    User addUser(User user);
}
