package com.vdbone.vdbone.model;

import javax.persistence.*;

@Entity
@Table(name = "cuenta")
@Access(AccessType.FIELD)
public class Cuenta extends ParentEntity {

    @Column(name="tipo", nullable = false, length = 255)
    private String tipo;

    @Column(name="monto", nullable = false)
    private Double monto;

    @Column(name="id_cliente", nullable = true, length = 11)
    private Long idCliente;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}
