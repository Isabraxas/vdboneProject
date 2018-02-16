package com.vdbone.vdbone.service;

import com.vdbone.vdbone.dao.CuentaRepository;
import com.vdbone.vdbone.model.Cuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CuentaServiceImpl implements CuentaService {
    @Autowired
    protected CuentaRepository cuentaRepository;

    @Override
    public List<Cuenta> getAll() {
        return this.cuentaRepository.findAll() ;
    }

    @Override
    public void save(Cuenta cuenta) {
        this.cuentaRepository.save(cuenta);
    }

    @Override
    public void delete(Long id) {
        this.cuentaRepository.delete(id);
    }
}
