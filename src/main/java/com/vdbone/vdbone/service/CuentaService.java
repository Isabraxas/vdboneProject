package com.vdbone.vdbone.service;

import com.vdbone.vdbone.model.Cuenta;

import java.util.List;

public interface CuentaService {

    /**
     * Retorna la lista de todas las cuentas
     * @return
     */
    List<Cuenta> getAll();

    /**
     * Crea una nueva cuenta
     * @param cuenta
     */
    void save(Cuenta cuenta);

    /**
     * Elimina una cuenta en base al id provisto
     * @param id
     */
    void delete(Long id);
}
