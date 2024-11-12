package smart.job.test.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class UserRequest {

    private String name;

    private String email;

    private String password;

    private List<Telefono> phones;
}
