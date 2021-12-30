package com.crud.proyectox.interfaces;

import com.crud.proyectox.daos.Clientes;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IClienteDao extends CrudRepository<Clientes, Long> {
    public Clientes findByNombre(String nombre);

    public void deleteByNombre(String nombre);

    @Modifying(clearAutomatically = true)
    @Query("UPDATE Clientes c SET c.nombre = :nombre, c.correo= :correo WHERE c.nombre = :nombreModi")
    public void updateByNombre(@Param("nombre") String nombre, @Param("correo") String correo, @Param("nombreModi") String nombreModi);
}
