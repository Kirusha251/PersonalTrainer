package by.achramionok.service;

import by.achramionok.model.User;

import java.util.Collection;

/**
 * Created by Kirill on 04.03.2017.
 */

public interface UserService {
    User findById(Integer idUser);
    User findByEmail(String email);
    User findByName(String name);
    void save(User user);
    void deleteById(Integer idUser);
    Collection<User> findAll();
}
