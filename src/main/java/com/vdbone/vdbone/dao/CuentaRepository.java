package com.vdbone.vdbone.dao;

import com.vdbone.vdbone.model.Cliente;
import com.vdbone.vdbone.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CuentaRepository extends JpaRepository<Cuenta,Long> {
    @Query(value = "select cliente.* from cuenta left join cliente on cuenta.id_cliente= cliente.id where cuenta.id_cliente=?1",nativeQuery = true)
    List<Cuenta> findClientebyid(Long id);
}
