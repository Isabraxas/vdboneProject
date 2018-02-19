package com.vdbone.vdbone.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vdbone.vdbone.model.Cliente;
import com.vdbone.vdbone.model.Cuenta;
import com.vdbone.vdbone.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController  {
    @Autowired
    protected ClienteService clienteService;

    protected ObjectMapper mapper;

    @RequestMapping(value = "/getAll")
    public List<Cliente> getAll(){
        return this.clienteService.getAll();
    }

    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
    public List<Cliente> saveOrUpdate(@RequestBody Cliente cliente){

        this.clienteService.save(cliente);
        return this.clienteService.getAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public List<Cliente> delete(@PathVariable Long id){

        this.clienteService.delete(id);
        return this.clienteService.getAll();
    }

    @RequestMapping(value = "/buscaPorCorreo/{correo}", method = RequestMethod.GET)
    public List<Cliente> buscaPorCorreo(@PathVariable String correo){
        return this.clienteService.findByCorreo(correo);
    }

    @RequestMapping(value = "/getCuentas/{id}", method = RequestMethod.GET)
    public List<Object> getCuentas(@PathVariable Long id){
        return this.clienteService.getCuentas(id);
    }

}
