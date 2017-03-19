package by.achramionok.service;

import by.achramionok.model.Exercise;

import java.util.Collection;

/**
 * Created by Kirill on 04.03.2017.
 */

public interface ExerciseService {
    Exercise findById(Integer id);
    Exercise findByName(String name);
    void save(Exercise exercise);
    void deleteById(Integer id);
    Collection<Exercise> findAll();
}
