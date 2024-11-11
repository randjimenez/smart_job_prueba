package smart.job.test.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Telefono {

    private String numero;
    private String codigoCiudad;
    private String codigoPais;
}
