package hu.tichss.database.service;

import hu.tichss.database.persistence.entity.User;

import java.util.List;

public interface UserService {
    User getById(Long id);
    List<User> getAll();
}
