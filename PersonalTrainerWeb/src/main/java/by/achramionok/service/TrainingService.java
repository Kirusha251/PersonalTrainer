package by.achramionok.service;

import by.achramionok.model.Training;

import java.util.Collection;

/**
 * Created by Kirill on 04.03.2017.
 */
public interface TrainingService {
    Training findByIdTraining(Integer id);
    Collection<Training> findAllByIdUser(Integer idUser);
    void save(Training training);
    void deleteByIdTraining(Integer id);
    Collection<Training> findAll();
}
