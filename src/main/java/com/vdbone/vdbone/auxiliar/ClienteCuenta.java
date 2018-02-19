package com.vdbone.vdbone.auxiliar;

import com.vdbone.vdbone.model.ParentEntity;

import javax.persistence.Column;

public class ClienteCuenta extends ParentEntity {

    @Column(name="tipo", nullable = false, length = 255)
    private String tipo;

    @Column(name="monto", nullable = false)
    private Double monto;

    @Column(name="id_cliente")
    private Long idCliente;

    public ClienteCuenta(String tipo, Double monto, Long idCliente) {
        super();
        this.tipo = tipo;
        this.monto = monto;
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

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

}
