package smart.job.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.job.test.model.entity.UserEntity;


import java.util.*;

public interface UsuarioRepository extends JpaRepository<UserEntity, UUID> {
    Optional<UserEntity> findByEmail(String email);
}
