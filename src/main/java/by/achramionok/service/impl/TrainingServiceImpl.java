package by.achramionok.service.impl;

import by.achramionok.model.Training;
import by.achramionok.repository.TrainingRepository;
import by.achramionok.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Kirill on 04.03.2017.
 */
@Service
public class TrainingServiceImpl implements TrainingService {

    @Autowired
    private TrainingRepository trainingRepository;

    @Override
    public Training findById(Integer id) {
        return trainingRepository.findOne(id);
    }

    @Override
    public Collection<Training> findAllByUserId(Integer idUser) {
        return findAllByUserId(idUser);
    }

    @Override
    public void save(Training training) {
        trainingRepository.save(training);
    }

    @Override
    public void deleteById(Integer id) {
        trainingRepository.delete(id);
    }

    @Override
    public Collection<Training> findAll() {
        return trainingRepository.findAll();
    }
}
