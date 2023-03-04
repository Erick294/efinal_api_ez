package com.uce.efinal2_api_ez.service;

import java.util.List;

import com.uce.efinal2_api_ez.repository.modelo.Producto;
import com.uce.efinal2_api_ez.service.to.ProductoTo;

public interface IProductoService {
    public void insertarProducto(Producto prod);
    public List<ProductoTo> obtenerProductos();
    public void actualizarProducto(Integer id, Producto prod);
    public ProductoTo obtenerId(Integer id);
    public void eliminarProducto(Integer id); 
}
