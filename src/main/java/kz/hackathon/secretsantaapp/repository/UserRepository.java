package kz.hackathon.secretsantaapp.repository;

import kz.hackathon.secretsantaapp.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(String username);
    boolean existsByEmail(String username);
}
