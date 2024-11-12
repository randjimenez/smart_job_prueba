package smart.job.test.service;

import smart.job.test.model.entity.UserEntity;
import smart.job.test.model.exceptions.UserAlreadyExistExcepcion;

public interface UserService {
    UserEntity crearUsuario(UserEntity request) throws UserAlreadyExistExcepcion;
}
