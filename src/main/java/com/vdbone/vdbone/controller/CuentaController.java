package com.vdbone.vdbone.controller;

import com.vdbone.vdbone.model.Cliente;
import com.vdbone.vdbone.model.Cuenta;
import com.vdbone.vdbone.model.Cuenta;
import com.vdbone.vdbone.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cuenta")
public class CuentaController {

    @Autowired
    protected CuentaService cuentaService;

    @RequestMapping(value = "/getAll")
    public List<Cuenta> getAll(){
        return this.cuentaService.getAll();
    }

    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
    public List<Cuenta> saveOrUpdate(@RequestBody Cuenta cuenta){

        this.cuentaService.save(cuenta);
        return this.cuentaService.getAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public List<Cuenta> delete(@PathVariable Long id){

        this.cuentaService.delete(id);
        return this.cuentaService.getAll();
    }



}
