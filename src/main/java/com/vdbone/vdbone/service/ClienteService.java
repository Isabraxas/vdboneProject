package com.vdbone.vdbone.service;

import com.vdbone.vdbone.model.Cliente;

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
}
