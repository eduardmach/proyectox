package com.crud.proyectox.interfaces;

import com.crud.proyectox.daos.Clientes;

import java.util.List;

public interface IClienteService {
    public List<Clientes> getCliente();
    public void setCliente(Clientes clientes);
    public void updateCliente(String nombre,Clientes clientes);
    public void deleateCliente(Clientes clientes);
}
