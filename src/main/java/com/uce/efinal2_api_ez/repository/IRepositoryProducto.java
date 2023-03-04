package com.uce.efinal2_api_ez.repository;

import java.util.List;

import com.uce.efinal2_api_ez.repository.modelo.Producto;

public interface IRepositoryProducto {
    
    public void insertarProducto(Producto prod);
    public List<Producto> obtenerProductos();
    public void actualizarProducto(Integer id, Producto prod);
    public Producto obtenerId(Integer id);
    public void eliminarProducto(Integer id); 

}
