package smart.job.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.job.test.model.dto.UserRequest;
import smart.job.test.model.dto.UserResponse;
import smart.job.test.model.exceptions.UserAlreadyExistExcepcion;
import smart.job.test.service.UserService;
import smart.job.test.utils.UsuarioMapper;

@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(
            @RequestBody UserRequest request
    ) throws UserAlreadyExistExcepcion {
        return ResponseEntity.ok(
                UsuarioMapper.toDtoResponse(
                        userService.crearUsuario(UsuarioMapper.toEntity(request))
                )
        );
    }
}
