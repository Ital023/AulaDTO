package io.github.ital023.AulaDTOItal023.services;

import io.github.ital023.AulaDTOItal023.dto.CreateUserDTO;
import io.github.ital023.AulaDTOItal023.dto.UserDTO;
import io.github.ital023.AulaDTOItal023.dto.UserMinDTO;
import io.github.ital023.AulaDTOItal023.entities.User;
import io.github.ital023.AulaDTOItal023.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public List<UserDTO> findAll() {
        List<User> users = repository.findAll();

        return users.stream().map(user -> new UserDTO(user)).toList();
    }

    @Transactional(readOnly = true)
    public List<UserMinDTO> findAllMin() {
        List<User> users = repository.findAll();

        return users.stream().map(user -> new UserMinDTO(user)).toList();
    }

    @Transactional
    public CreateUserDTO insert(CreateUserDTO createUserDTO) {
        User entity = new User();

        copyDtoToEntity(createUserDTO, entity);

        entity = repository.save(entity);

        return new CreateUserDTO(entity);
    }

    private void copyDtoToEntity(CreateUserDTO dto, User entity) {
        entity.setId(dto.getId());
        entity.setUsername(dto.getUsername());
        entity.setDescription(dto.getDescription());
        entity.setPassword(dto.getPassword());
        entity.setEmail(dto.getEmail());
        entity.setImg_url(dto.getImg_url());
    }

}
