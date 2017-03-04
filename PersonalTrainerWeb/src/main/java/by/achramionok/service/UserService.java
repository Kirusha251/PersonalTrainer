package by.achramionok.service;

import by.achramionok.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Kirill on 04.03.2017.
 */
@Service
public interface UserService {
    User findByIdUser(Integer idUser);
    User findByEmailUser(String email);
    User findByNameUser(String name);
    void save(User user);
    void deleteByIdUser(Integer idUser);
    Collection<User> findAll();
}
