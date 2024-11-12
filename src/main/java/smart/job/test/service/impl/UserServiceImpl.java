package smart.job.test.service.impl;

import org.springframework.stereotype.Service;
import smart.job.test.model.entity.UserEntity;
import smart.job.test.model.exceptions.UserAlreadyExistExcepcion;
import smart.job.test.repository.UsuarioRepository;
import smart.job.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UsuarioRepository usuarioRepository;

    public UserServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserEntity crearUsuario(UserEntity user) throws UserAlreadyExistExcepcion {
        var userData = usuarioRepository.findByEmail(user.getEmail());
        if(userData.isEmpty()) {
            return usuarioRepository.save(user);
        }else {
            throw new UserAlreadyExistExcepcion("El correo ya esta registrado");
        }

    }
}
