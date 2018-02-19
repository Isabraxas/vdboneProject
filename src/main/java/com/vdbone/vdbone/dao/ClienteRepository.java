package com.vdbone.vdbone.dao;

import com.vdbone.vdbone.model.Cliente;
import com.vdbone.vdbone.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
  // Cliente save(Cliente cliente);

    @Query(value = "SELECT * FROM cliente WHERE correo_electronico LIKE %?1%", nativeQuery = true)
    List<Cliente> findByCorreo(String correo);

    @Query(value = "select cuenta.* from cliente left join cuenta on cliente.id= cuenta.id_cliente where cliente.id=?1", nativeQuery = true)
    List<Object> findCuentaByIdCliente(Long id);
}
