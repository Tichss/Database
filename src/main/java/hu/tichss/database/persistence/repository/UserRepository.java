package hu.tichss.database.persistence.repository;

import hu.tichss.database.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository {
    User findById(Long id);

    List<User> findAll();
}