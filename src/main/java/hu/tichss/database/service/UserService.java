package hu.tichss.database.service;

import hu.tichss.database.persistence.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> getById(Long id);
    List<User> getAll();
    User save(final User user);
}
