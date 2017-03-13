package by.achramionok.controller;

import by.achramionok.model.Training;
import by.achramionok.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("training")
public class TrainingController {

    @Autowired
    private TrainingRepository trainingRepository;
    @ResponseBody
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<Training>> getAllTrainings(){
        List<Training> trainings = trainingRepository.findAll();
        return ResponseEntity.ok(trainings);
    }
}
