package by.achramionok.service.impl;

import by.achramionok.model.Exercise;
import by.achramionok.repository.ExerciseRepository;
import by.achramionok.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Kirill on 04.03.2017.
 */
@Service
public class ExerciseServiceImpl implements ExerciseService {
    @Autowired
    ExerciseRepository exerciseRepository;

    @Override
    public Exercise findByIdExercise(Integer id) {
        return exerciseRepository.findByIdExercise(id);
    }

    @Override
    public Exercise findByNameExercise(String name) {
        return exerciseRepository.findByNameExercise(name);
    }

    @Override
    public void save(Exercise exercise) {
        exerciseRepository.save(exercise);
    }

    @Override
    public void deleteByIdExercise(Integer id) {
        exerciseRepository.deleteByIdExercise(id);
    }

    @Override
    public Collection<Exercise> findAll() {
        return exerciseRepository.findAll();
    }
}
