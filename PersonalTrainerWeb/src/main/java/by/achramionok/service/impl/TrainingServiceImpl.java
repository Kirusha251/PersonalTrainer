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
    public Training findByIdTraining(Integer id) {
        return trainingRepository.findByIdTraining(id);
    }

    @Override
    public Collection<Training> findAllByIdUser(Integer idUser) {
        return findAllByIdUser(idUser);
    }

    @Override
    public void save(Training training) {
        trainingRepository.save(training);
    }

    @Override
    public void deleteByIdTraining(Integer id) {
        trainingRepository.deleteByIdTraining(id);
    }

    @Override
    public Collection<Training> findAll() {
        return trainingRepository.findAll();
    }
}
