package by.achramionok.repository;

import by.achramionok.model.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by Kirill on 04.03.2017.
 */

public interface TrainingRepository extends JpaRepository <Training, Integer> {
    Training findById(Integer id);
    Collection<Training> findAllByUserId(Integer idUser);

    void deleteById(Integer id);
}
