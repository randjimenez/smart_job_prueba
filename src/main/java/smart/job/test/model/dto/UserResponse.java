package smart.job.test.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class UserResponse {

    private UUID id;

    private LocalDateTime created;

    private LocalDateTime modified;

    @JsonProperty("last_login")
    private LocalDateTime lastLogin;

    private UUID token;

    @JsonProperty("is_enabled")
    private Boolean isEnabled;


}
