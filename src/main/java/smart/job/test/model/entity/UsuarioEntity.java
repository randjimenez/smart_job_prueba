package smart.job.test.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class UsuarioEntity {
    @Id
    private UUID id;


}
