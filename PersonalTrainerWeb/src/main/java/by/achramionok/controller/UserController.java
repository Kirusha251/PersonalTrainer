package by.achramionok.controller;

import by.achramionok.model.User;
import by.achramionok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * Created by Kirill on 04.03.2017.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Collection<User> getAllUsers(){
        return userService.findAll();
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public User getById(@PathVariable String id){
        return userService.findById(Integer.valueOf(id));
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public User getByName(@PathVariable String name){
        return userService.findByName(name);
    }

    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
    public User getByEmail(@PathVariable String email){
        return userService.findByName(email);
    }
}
