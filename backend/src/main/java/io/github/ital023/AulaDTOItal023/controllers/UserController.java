package io.github.ital023.AulaDTOItal023.controllers;

import io.github.ital023.AulaDTOItal023.dto.CreateUserDTO;
import io.github.ital023.AulaDTOItal023.dto.UserDTO;
import io.github.ital023.AulaDTOItal023.dto.UserMinDTO;
import io.github.ital023.AulaDTOItal023.entities.User;
import io.github.ital023.AulaDTOItal023.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> users = userService.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping(value = "/minDTO")
    public ResponseEntity<List<UserMinDTO>> findAllMin() {
        List<UserMinDTO> users = userService.findAllMin();
        return ResponseEntity.ok(users);
    }

    @PostMapping
    public ResponseEntity<CreateUserDTO> insert(@Valid @RequestBody CreateUserDTO dto) {
        CreateUserDTO user = userService.insert(dto);
        return ResponseEntity.ok(user);
    }

}
