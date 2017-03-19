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
    private ExerciseRepository exerciseRepository;

    @Override
    public Exercise findById(Integer id) {
        return exerciseRepository.findById(id);
    }

    @Override
    public Exercise findByName(String name) {
        return exerciseRepository.findByName(name);
    }

    @Override
    public void save(Exercise exercise) {
        exerciseRepository.save(exercise);
    }

    @Override
    public void deleteById(Integer id) {
        exerciseRepository.deleteById(id);
    }

    @Override
    public Collection<Exercise> findAll() {
        return exerciseRepository.findAll();
    }
}
