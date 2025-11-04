package ni.edu.uam.facturacion.modelo;

import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Producto {
    @Id
    @Column
    int numero;

    @Column(length=50)
    String descripcion;
}
