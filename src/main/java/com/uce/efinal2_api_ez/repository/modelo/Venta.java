package com.uce.efinal2_api_ez.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_venta")
    @SequenceGenerator(name = "seq_venta", sequenceName = "seq_venta", allocationSize = 1)
    @Column(name = "vent_id")
    private Integer id;

    @Column(name = "vent_cedula_cliente")
    String cedulaCliente;

    @Column(name = "vent_numero_venta")
    Integer numeroVenta;

    @Column(name = "vent_total_venta")
    BigDecimal totalVenta;

    @ManyToOne
    @JoinColumn(name = "vent_id_detalle")
    private DetalleVenta detalle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public Integer getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(Integer numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public BigDecimal getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(BigDecimal totalVenta) {
        this.totalVenta = totalVenta;
    }

    public DetalleVenta getDetalleVenta() {
        return detalle;
    }

    public void setDetalleVenta(DetalleVenta detalleVenta) {
        this.detalle = detalleVenta;
    }

    
}
