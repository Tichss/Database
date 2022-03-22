package hu.tichss.database.service.impl;

import hu.tichss.database.persistence.entity.User;
import hu.tichss.database.persistence.repository.UserRepository;
import hu.tichss.database.service.UserService;
import java.util.Optional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public Optional<User> getById(final Long id) {
        return this.getRepository().findById(id);
    }

    @Override
    public List<User> getAll() {
        return this.getRepository().findAll();
    }

    @Override
    public User save(final User user) {
        return this.getRepository().save(user);
    }
}
