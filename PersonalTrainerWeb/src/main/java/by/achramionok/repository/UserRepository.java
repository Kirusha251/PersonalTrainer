package by.achramionok.repository;

import by.achramionok.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kirill on 04.03.2017.
 */
public interface UserRepository extends JpaRepository <User, Integer> {
    User findByIdUser(Integer idUser);
    User findByEmailUser(String email);
    User findByNameUser(String name);

    void deleteByIdUser(Integer idUser);
}
