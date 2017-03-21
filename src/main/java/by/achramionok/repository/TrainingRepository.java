package by.achramionok.repository;

import by.achramionok.model.Training;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kirill on 04.03.2017.
 */

public interface TrainingRepository extends JpaRepository <Training, Integer> {
}
