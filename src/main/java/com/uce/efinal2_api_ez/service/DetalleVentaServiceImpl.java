package com.uce.efinal2_api_ez.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.efinal2_api_ez.repository.IRepositoryDetalleVenta;
import com.uce.efinal2_api_ez.repository.modelo.DetalleVenta;
import com.uce.efinal2_api_ez.service.to.DetalleVentaTo;

@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService {

    @Autowired
    IRepositoryDetalleVenta detRepository;
    
    @Override
    public void actualizarProducto(Integer id, DetalleVenta det) {
        // TODO Auto-generated method stub
        this.detRepository.actualizarProducto(id, det);
    }

    @Override
    public void insertarProducto(DetalleVenta det) {
        // TODO Auto-generated method stub
        this.detRepository.insertarProducto(det);
    }

    @Override
    public DetalleVentaTo obtenerId(Integer id) {
        // TODO Auto-generated method stub
        return convertir(this.detRepository.obtenerId(id));
    }

    @Override
    public List<DetalleVentaTo> obtenerProductos() {
        // TODO Auto-generated method stub
        List<DetalleVenta> lista = this.detRepository.obtenerProductos();
        List<DetalleVentaTo> listaTo = lista.stream().map(producto -> convertir(producto)).collect(Collectors.toList());
        return listaTo;
    }

    private DetalleVentaTo convertir(DetalleVenta vent){
        DetalleVentaTo detTo = new DetalleVentaTo();
        detTo.setCantidad(vent.getCantidad());
        detTo.setId(vent.getId());
        detTo.setPrecioUnitario(vent.getPrecioUnitario());
        detTo.setSubtotal(vent.getSubtotal());
        return detTo;
    }
    
}
