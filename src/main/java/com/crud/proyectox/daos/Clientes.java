package com.crud.proyectox.daos;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "clients")
public class Clientes implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private static final long serialVersionUID = 1L;

    private String nombre;

    private String correo;
}
