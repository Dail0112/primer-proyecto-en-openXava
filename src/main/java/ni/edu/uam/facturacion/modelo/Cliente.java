package ni.edu.uam.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Cliente {
    @Id
    @Column(length = 6)
    int idCliente;

    @Column(length=50)
    @Required
    String nombre;

}
