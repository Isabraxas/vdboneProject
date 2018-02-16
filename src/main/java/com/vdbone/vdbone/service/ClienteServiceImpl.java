package com.vdbone.vdbone.service;

import com.vdbone.vdbone.dao.ClienteRepository;
import com.vdbone.vdbone.model.Cliente;
import com.vdbone.vdbone.model.Cuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    protected ClienteRepository clienteRepository;


    @Override
    public List<Cliente> getAll() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente save(Cliente cliente) {
       return this.clienteRepository.save(cliente);
    }

    @Override
    public void delete(Long id) {
        this.clienteRepository.delete(id);
    }

    @Override
    public List<Cliente> findByCorreo(String correo) {
        return this.clienteRepository.findByCorreo(correo);
    }

    @Override
    public List<Cuenta> getCuentas(Long id) {
        return this.clienteRepository.findCuentaByIdCliente(id);
    }
}
