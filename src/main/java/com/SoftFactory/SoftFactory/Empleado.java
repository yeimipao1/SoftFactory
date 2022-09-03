package com.SoftFactory.SoftFactory;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;}

    @Column(name = "email",unique = true)
    private String email;
    private String rol;

@ManyToOne
    private Empresa enterprise;

    private Date updateAt;
    private Date createdAt;

    public Empleado() {

    }

    public Empleado(long id, String email, String rol, Empresa enterprise, Date updateAt, Date createdAt) {
        this.id = id;
        this.email = email;
        this.rol = rol;
        this.enterprise = enterprise;
        this.updateAt = updateAt;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Empresa getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Empresa enterprise) {
        this.enterprise = enterprise;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
