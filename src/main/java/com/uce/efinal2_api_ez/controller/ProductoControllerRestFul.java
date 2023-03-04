package com.uce.efinal2_api_ez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
import com.uce.efinal2_api_ez.service.IProductoService;
import com.uce.efinal2_api_ez.service.to.ProductoTo;

@RequestMapping("/productos")
@CrossOrigin()
@RestController
public class ProductoControllerRestFul {

    @Autowired
    IProductoService prodService;

    @PostMapping()
    private void registrarProducto(@RequestBody Producto prod){
        this.prodService.insertarProducto(prod);
    }

    @GetMapping(path = "/{id}")
    private ProductoTo obtenerProductoId(@PathVariable("id") Integer id){
        return this.prodService.obtenerId(id);
    }

    @GetMapping()
    private List<ProductoTo> obteneProductos(){
        return this.prodService.obtenerProductos();
    }

    @PutMapping(path = "/{id}")
    private void actualizarProducto(@PathVariable("id") Integer id, @RequestBody Producto prod){
        this.prodService.actualizarProducto(id, prod);
    }

    @DeleteMapping(path = "/{id}")
    private void eliminarProducto(@PathVariable("id") Integer id){
        this.prodService.eliminarProducto(id);
    }
}
