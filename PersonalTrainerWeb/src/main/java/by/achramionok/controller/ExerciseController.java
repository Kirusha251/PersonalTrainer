package by.achramionok.controller;

import by.achramionok.model.Exercise;
import by.achramionok.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by Kirill on 06.03.2017.
 */
@RestController
public class ExerciseController {
    @Autowired
    private ExerciseService exerciseService;

    @RequestMapping(name = "/exercise",method = RequestMethod.GET)
    public Collection<Exercise> getAll(){
        return exerciseService.findAll();
    }
}
