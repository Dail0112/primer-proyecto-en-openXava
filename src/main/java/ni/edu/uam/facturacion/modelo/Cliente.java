package ni.edu.uam.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;
import org.openxava.annotations.View;

import javax.persistence.*;

@Entity
@Getter
@Setter

@View(name="Simple", // Esta vista solo se usará cuando se especifique ?Simple?
        members="numero, nombre" // Muestra únicamente numero y nombre en la misma línea
)
public class Cliente {
    @Id
    @Column(length = 6)
    int idCliente;

    @Column(length=50)
    @Required
    String nombre;

    @Embedded
    Direccion direccion;

}
