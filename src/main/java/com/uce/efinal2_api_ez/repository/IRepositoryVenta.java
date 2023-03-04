package com.uce.efinal2_api_ez.repository;

import java.util.List;

import com.uce.efinal2_api_ez.repository.modelo.Venta;

public interface IRepositoryVenta {
    public void insertarVenta(Venta prod);
    public List<Venta> obtenerVenta();
    public void actualizarVenta(Integer id, Venta vent);
    public Venta obtenerId(Integer id);
    public void eliminarVenta(Integer id); 
}
