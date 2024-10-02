package io.github.ital023.AulaDTOItal023.repositories;

import io.github.ital023.AulaDTOItal023.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
