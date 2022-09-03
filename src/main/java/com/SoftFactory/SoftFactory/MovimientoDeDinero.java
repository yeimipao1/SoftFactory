package com.SoftFactory.SoftFactory;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class MovimientoDeDinero {
    private long id;
    private String email;
    private Date updateAt;
    private Date createdAt;

    private float montoMovimiento;

    private String conceptoMonto;

    public MovimientoDeDinero(long id, String email, Date updateAt, Date createdAt, float montoMovimiento, String conceptoMonto) {
        this.id = id;
        this.email = email;
        this.updateAt = updateAt;
        this.createdAt = createdAt;
        this.montoMovimiento = montoMovimiento;
        this.conceptoMonto = conceptoMonto;
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

    public float getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(float montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMonto() {
        return conceptoMonto;
    }

    public void setConceptoMonto(String conceptoMonto) {
        this.conceptoMonto = conceptoMonto;
    }
}
