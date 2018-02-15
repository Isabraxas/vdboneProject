package com.vdbone.vdbone.dao;

import com.vdbone.vdbone.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
   Cliente save(Cliente cliente);
}
