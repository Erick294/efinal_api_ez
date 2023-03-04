package com.uce.efinal2_api_ez.service;

import java.util.List;

import com.uce.efinal2_api_ez.repository.modelo.DetalleVenta;
import com.uce.efinal2_api_ez.service.to.DetalleVentaTo;

public interface IDetalleVentaService {
    public void insertarProducto(DetalleVenta det);
    public List<DetalleVentaTo> obtenerProductos();
    public void actualizarProducto(Integer id, DetalleVenta det);
    public DetalleVentaTo obtenerId(Integer id);
}
