package com.vdbone.vdbone.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cliente")
@Access(AccessType.FIELD)
public class Cliente extends ParentEntity{


    @Column(name = "nombre",nullable = false,length = 255)
    private String nombre;

    @Column(name = "direccion",nullable = false,length = 255)
    private String direccion;

    @Column(name = "correo_electronico",nullable = false,length = 255)
    private String correoElectronico;

    @Column(name = "telefono1",nullable = false,length = 10)
    private String telefono1;

    @Column(name = "telefono2",nullable = false,length = 10)
    private String telefono2;

    @Column(name = "telefono3",nullable = false,length = 10)
    private String telefono3;

    @Column(name = "id_cuenta",nullable = true,length = 11)
    private String idCuenta;

    @OneToMany(mappedBy = "idCliente", cascade = CascadeType.PERSIST)
    private List<Cuenta> cuentas = new ArrayList<Cuenta>();


    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getTelefono3() {
        return telefono3;
    }

    public void setTelefono3(String telefono3) {
        this.telefono3 = telefono3;
    }
}
