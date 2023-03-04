package com.uce.efinal2_api_ez.repository;

import java.util.List;

import com.uce.efinal2_api_ez.repository.modelo.DetalleVenta;

public interface IRepositoryDetalleVenta {
    public void insertarProducto(DetalleVenta det);
    public List<DetalleVenta> obtenerProductos();
    public void actualizarProducto(Integer id, DetalleVenta det);
    public DetalleVenta obtenerId(Integer id);
}
