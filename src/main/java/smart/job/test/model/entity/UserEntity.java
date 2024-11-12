package smart.job.test.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "UUID")
    private UUID id;

    private String email;

    private String password;

    private LocalDateTime created;

    private LocalDateTime modified;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;

    private UUID token;

    @Column(name = "is_enabled")
    private Boolean isEnabled;

}
