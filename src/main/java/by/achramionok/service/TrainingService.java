package by.achramionok.service;

import by.achramionok.model.Training;

import java.util.Collection;

/**
 * Created by Kirill on 04.03.2017.
 */

public interface TrainingService {
    Training findById(Integer id);
    Collection<Training> findAllByUserId(Integer idUser);
    void save(Training training);
    void deleteById(Integer id);
    Collection<Training> findAll();
}
