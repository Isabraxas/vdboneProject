package com.vdbone.vdbone.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vdbone.vdbone.model.Cliente;
import com.vdbone.vdbone.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class ClienteController  {
    @Autowired
    protected ClienteService clienteService;

    protected ObjectMapper mapper;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<Cliente> save(@RequestBody String clienteJson) throws IOException {

        this.mapper= new ObjectMapper();
        Cliente cliente = this.mapper.readValue(clienteJson, Cliente.class);

        this.clienteService.save(cliente);
        return this.clienteService.getAll();
    }
}
