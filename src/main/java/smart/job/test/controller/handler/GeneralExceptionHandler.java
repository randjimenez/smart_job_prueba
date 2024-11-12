package smart.job.test.controller.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import smart.job.test.model.exceptions.ErrorMessage;
import smart.job.test.model.exceptions.UserAlreadyExistExcepcion;

@ControllerAdvice
public class GeneralExceptionHandler {

    @ExceptionHandler(UserAlreadyExistExcepcion.class)
    public ResponseEntity<ErrorMessage> handleUserAlreadyExistExcepcion(UserAlreadyExistExcepcion ex) {
        ErrorMessage errorMessage = ErrorMessage.builder()
                .message(ex.getMessage())
                .build();

        return ResponseEntity.status(409).body(errorMessage);
    }

}
