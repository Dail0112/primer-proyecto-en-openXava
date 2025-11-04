package ni.edu.uam.facturacion.modelo;

import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Producto {
    @Id
    @Column
    int numero;

    @Column(length=50)
    String descripcion;

    @ManyToOne(
            fetch = FetchType.LAZY,optional = true)
    @DescriptionsList
    Categoria categoria;

    @Money
    BigDecimal precio;

    @Files
    @Column(length=32)
    String foto;

    @TextArea
    String observaciones;

}
