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
    public User findById(Integer idUser) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User findByName(String name) {
        return null;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteById(Integer idUser) {
        userRepository.delete(idUser);
    }
    @Override
    public Collection<User> findAll() {
        return userRepository.findAll();
    }
}
