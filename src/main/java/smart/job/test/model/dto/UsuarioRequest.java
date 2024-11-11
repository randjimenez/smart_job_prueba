package smart.job.test.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UsuarioRequest {
    private String nombre;
    private String correo;
    private String contrasena;

    @JsonProperty("telefonos")
    private List<Telefono> telefonoList;
}
