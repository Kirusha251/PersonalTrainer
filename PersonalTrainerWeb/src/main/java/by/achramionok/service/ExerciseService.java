package by.achramionok.service;

import by.achramionok.model.Exercise;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Kirill on 04.03.2017.
 */
@Service
public interface ExerciseService {
    Exercise findByIdExercise(Integer id);
    Exercise findByNameExercise(String name);
    void save(Exercise exercise);
    void deleteByIdExercise(Integer id);
    Collection<Exercise> findAll();
}
