package smart.job.test.model.exceptions;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class ErrorMessage {
    private String message;

}
