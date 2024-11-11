package smart.job.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.job.test.model.dto.UsuarioRequest;

@RestController
@RequestMapping("api/users")
public class UsuarioController {

    @PostMapping
    public ResponseEntity<Object> createUser(
            @RequestBody UsuarioRequest request
            ){

        return ResponseEntity.ok().build();

    }



}
