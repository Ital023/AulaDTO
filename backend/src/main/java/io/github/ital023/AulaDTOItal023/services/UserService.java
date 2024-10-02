package io.github.ital023.AulaDTOItal023.services;

import io.github.ital023.AulaDTOItal023.entities.User;
import io.github.ital023.AulaDTOItal023.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        List<User> users = repository.findAll();
        return users;
    }


}
