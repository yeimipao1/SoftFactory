package com.SoftFactory.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Empresa {

    @Id
    private long id;

    @OneToMany
    private Empleado employee;

    private String nombreEmpresa;

    private String direccion;

    private int telefono;

    public Empresa(long id, Empleado employee, String nombreEmpresa, String direccion, int telefono) {
        this.id = id;
        this.employee = employee;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Empleado getEmployee() {
        return employee;
    }

    public void setEmployee(Empleado employee) {
        this.employee = employee;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
