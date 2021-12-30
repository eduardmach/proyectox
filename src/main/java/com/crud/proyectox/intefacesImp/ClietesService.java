package com.crud.proyectox.intefacesImp;

import com.crud.proyectox.daos.Clientes;
import com.crud.proyectox.interfaces.IClienteDao;
import com.crud.proyectox.interfaces.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClietesService implements IClienteService {
    @Autowired
    IClienteDao clienteDao;

    @Override
    public List<Clientes> getCliente() {
        return (List<Clientes>) clienteDao.findAll();
    }

    @Override
    public void setCliente(Clientes clientes) {
        clienteDao.save(clientes);
    }

    @Override
    public void updateCliente(String nombre, Clientes clientes) {
        Optional<Clientes> cliente = Optional.ofNullable(clienteDao.findByNombre(nombre));
        if(cliente.isPresent()){
            clienteDao.updateByNombre(clientes.getNombre(),clientes.getCorreo(),nombre);
        }
    }

    @Override
    public void deleateCliente(Clientes clientes) {
        clienteDao.deleteByNombre(clientes.getNombre());
    }
}
