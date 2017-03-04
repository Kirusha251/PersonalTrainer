package by.achramionok.service.impl;

import by.achramionok.model.User;
import by.achramionok.repository.UserRepository;
import by.achramionok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Kirill on 04.03.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByIdUser(Integer idUser) {
        return userRepository.findByIdUser(idUser);
    }

    @Override
    public User findByEmailUser(String email) {
        return userRepository.findByEmailUser(email);
    }

    @Override
    public User findByNameUser(String name) {
        return userRepository.findByNameUser(name);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteByIdUser(Integer idUser) {
        userRepository.deleteByIdUser(idUser);
    }

    @Override
    public Collection<User> findAll() {
        return userRepository.findAll();
    }
}
