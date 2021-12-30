package com.crud.proyectox.controller;

import com.crud.proyectox.daos.Clientes;
import com.crud.proyectox.intefacesImp.ClietesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ControllerRest {
    @Autowired
    ClietesService service;

    @GetMapping(value = "listado")
    public List<Clientes> getListClientes() {
        return service.getCliente();
    }

    @PostMapping("gestionar/insertar")
    public List<Clientes> guardarCliente(@RequestBody Clientes clientes) {
        service.setCliente(clientes);
        return service.getCliente();
    }

    @PutMapping("gestionar/modificar/{nombre}")
    public List<Clientes> modificarCliente(@RequestBody Clientes clientes, @PathVariable String nombre) {
        service.updateCliente(nombre, clientes);
        return service.getCliente();
    }

    @DeleteMapping("gestionar/eliminar")
    public List<Clientes> eliminarCliente(@RequestBody Clientes clientes) {
        service.deleateCliente(clientes);
        return service.getCliente();
    }
}
