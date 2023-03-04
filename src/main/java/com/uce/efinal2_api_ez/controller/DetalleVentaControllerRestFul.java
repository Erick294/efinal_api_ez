package com.uce.efinal2_api_ez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uce.efinal2_api_ez.repository.modelo.DetalleVenta;
import com.uce.efinal2_api_ez.service.IDetalleVentaService;
import com.uce.efinal2_api_ez.service.to.DetalleVentaTo;


@RequestMapping("/detalle_ventas")
@CrossOrigin()
@RestController
public class DetalleVentaControllerRestFul {
    @Autowired
    IDetalleVentaService detService;

    @PostMapping()
    private void registrarProducto(@RequestBody DetalleVenta det){
        this.detService.insertarProducto(det);
    }

    @GetMapping(path = "/{id}")
    private DetalleVentaTo obtenerProductoId(@PathVariable("id") Integer id){
        return this.detService.obtenerId(id);
    }

    @GetMapping()
    private List<DetalleVentaTo> obteneProductos(){
        return this.detService.obtenerProductos();
    }

    @PutMapping(path = "/{id}")
    private void actualizarProducto(@PathVariable("id") Integer id, @RequestBody DetalleVenta det){
        this.detService.actualizarProducto(id, det);
    }
}
