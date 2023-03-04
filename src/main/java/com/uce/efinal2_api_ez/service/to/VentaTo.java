package com.uce.efinal2_api_ez.service.to;

import java.math.BigDecimal;

public class VentaTo {

    private Integer id;
    String cedulaCliente;
    Integer numeroVenta;
    BigDecimal totalVenta;
    
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
    
    
}
