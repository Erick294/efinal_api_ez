package com.uce.efinal2_api_ez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uce.efinal2_api_ez.repository.modelo.Producto;
import com.uce.efinal2_api_ez.repository.modelo.Venta;
import com.uce.efinal2_api_ez.service.IVentaService;
import com.uce.efinal2_api_ez.service.to.ProductoTo;
import com.uce.efinal2_api_ez.service.to.VentaTo;


@RequestMapping("/ventas")
@CrossOrigin()
@RestController
public class VentaControllerRestFul {
    
    @Autowired
    IVentaService ventService;

    @PostMapping()
    private void registrarVenta(@RequestBody Venta vent){
        this.ventService.insertarVenta(vent);;
    }

    @GetMapping(path = "/{id}")
    private VentaTo obtenerProductoId(@PathVariable("id") Integer id){
        return this.ventService.obtenerId(id);
    }

    @GetMapping()
    private List<VentaTo> obteneProductos(){
        return this.ventService.obtenerVenta();
    }

    @PutMapping(path = "/{id}")
    private void actualizarProducto(@PathVariable("id") Integer id, @RequestBody Producto prod){
        this.ventService.actualizarVenta(id, null);
    }

    @DeleteMapping(path = "/{id}")
    private void eliminarProducto(@PathVariable("id") Integer id){
        this.ventService.eliminarVenta(id);
    }
}
