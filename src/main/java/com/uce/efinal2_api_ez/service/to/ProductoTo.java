package com.uce.efinal2_api_ez.service.to;

import java.math.BigDecimal;

public class ProductoTo {


    Integer id;
    String codigoBarras;
    String nombre;
    Integer stock;
    BigDecimal precioUnidad;
    
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
    
    
}
