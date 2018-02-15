package com.vdbone.vdbone.service;

import com.vdbone.vdbone.dao.ClienteRepository;
import com.vdbone.vdbone.model.Cliente;
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
}
