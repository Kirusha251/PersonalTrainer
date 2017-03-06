package by.achramionok.repository;

import by.achramionok.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kirill on 04.03.2017.
 */
public interface ExerciseRepository extends JpaRepository <Exercise, Integer> {
    Exercise findById(Integer id);
    Exercise findByName(String name);

    void deleteById(Integer id);
}
