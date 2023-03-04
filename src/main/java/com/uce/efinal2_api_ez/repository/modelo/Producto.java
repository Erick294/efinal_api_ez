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
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_producto")
    @SequenceGenerator(name = "seq_producto", sequenceName = "seq_producto", allocationSize = 1)
    @Column(name = "prod_id")
    Integer id;

    @Column(name = "prod_codigo_barras")
    String codigoBarras;

    @Column(name = "prod_nombre")
    String nombre;

    @Column(name = "prod_stock")
    Integer stock;

    @Column(name = "prod_precio_unidad")
    BigDecimal precioUnidad;

    @ManyToOne
    @JoinColumn(name = "prod_id_detalle")
    private DetalleVenta detalle;

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public BigDecimal getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(BigDecimal precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public DetalleVenta getDetalleVenta() {
        return detalle;
    }

    public void setDetalleVenta(DetalleVenta detalleVenta) {
        this.detalle = detalleVenta;
    }

    
}
