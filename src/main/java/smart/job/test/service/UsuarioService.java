package smart.job.test.service;

import smart.job.test.model.dto.UsuarioRequest;
import smart.job.test.model.entity.UsuarioEntity;

public interface UsuarioService {
    public UsuarioEntity crearUsuario(UsuarioRequest request);
}
