package com.uce.efinal2_api_ez.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_detalle")
    @SequenceGenerator(name = "seq_detalle", sequenceName = "seq_detalle", allocationSize = 1)
    @Column(name = "detv_id")
    Integer id;

    @Column(name = "detv_cantidad")
    Integer cantidad;

    @Column(name = "detv_precio_unitario")
    BigDecimal precioUnitario;
    
    @Column(name = "detv_subtotal")
    BigDecimal subtotal;

    @OneToMany(mappedBy = "detalle", fetch = FetchType.EAGER)
    private List<Producto> productos;

    @OneToMany(mappedBy = "detalle", fetch = FetchType.EAGER)
    private List<Venta> ventas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    
}
