package com.vdbone.vdbone.service;

import com.vdbone.vdbone.model.Cliente;
import com.vdbone.vdbone.model.Cuenta;

import java.util.List;

public interface ClienteService {
    /**
     * Devuelve la lista de todos los clientes almacenados
     * @return
     */
    List<Cliente> getAll();

    /**
     * Añade un nuevo cliente a la base de datos
     * @param cliente
     * @return cliente
     */
    Cliente save(Cliente cliente);

    /**
     * Elimina el usuario basado en el id provisto
     * @param id
     */
    void delete(Long id);

    List<Cliente> findByCorreo(String correo);

    /**
     * Retorna las cuentas que le pertenecen al cliente en base al id
     * @param id
     * @return
     */
    List<Cuenta> getCuentas(Long id);
}
