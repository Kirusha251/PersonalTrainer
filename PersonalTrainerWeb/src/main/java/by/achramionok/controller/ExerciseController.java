package by.achramionok.controller;

import by.achramionok.model.Exercise;
import by.achramionok.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Kirill on 06.03.2017.
 */
@RestController
@RequestMapping(value = "exercise")
public class ExerciseController {
    @Autowired
    private ExerciseService exerciseService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public Collection<Exercise> getAll(){
        return exerciseService.findAll();
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public Exercise getById(@PathVariable String id){
        return exerciseService.findById(Integer.valueOf(id));
    }

}
