package com.uce.efinal2_api_ez.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.efinal2_api_ez.repository.IRepositoryVenta;
import com.uce.efinal2_api_ez.repository.modelo.Venta;
import com.uce.efinal2_api_ez.service.to.VentaTo;

@Service
public class VentaServiceimpl implements IVentaService{

    @Autowired
    IRepositoryVenta ventRepository;

    @Override
    public void actualizarVenta(Integer id, Venta vent) {
        // TODO Auto-generated method stub
        this.ventRepository.actualizarVenta(id, vent);
    }

    @Override
    public void eliminarVenta(Integer id) {
        // TODO Auto-generated method stub
        this.ventRepository.eliminarVenta(id);
    }

    @Override
    public void insertarVenta(Venta prod) {
        // TODO Auto-generated method stub
        this.ventRepository.insertarVenta(prod);
    }

    @Override
    public VentaTo obtenerId(Integer id) {
        // TODO Auto-generated method stub
        return convertir(this.ventRepository.obtenerId(id));
    }

    @Override
    public List<VentaTo> obtenerVenta() {
        // TODO Auto-generated method stub
        List<Venta> lista = this.ventRepository.obtenerVenta();
        List<VentaTo> listaTo = lista.stream().map(producto -> convertir(producto)).collect(Collectors.toList());
        return listaTo;
    }

    private VentaTo convertir(Venta prod){
        VentaTo ventTo = new VentaTo();
        ventTo.setCedulaCliente(prod.getCedulaCliente());
        ventTo.setId(prod.getId());
        ventTo.setNumeroVenta(prod.getNumeroVenta());
        ventTo.setTotalVenta(prod.getTotalVenta());
        return ventTo;
    }
    
}
