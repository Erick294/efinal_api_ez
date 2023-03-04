package com.uce.efinal2_api_ez.service;

import java.util.List;

import com.uce.efinal2_api_ez.repository.modelo.Venta;
import com.uce.efinal2_api_ez.service.to.VentaTo;

public interface IVentaService {
    public void insertarVenta(Venta prod);
    public List<VentaTo> obtenerVenta();
    public void actualizarVenta(Integer id, Venta vent);
    public VentaTo obtenerId(Integer id);
    public void eliminarVenta(Integer id); 
}
