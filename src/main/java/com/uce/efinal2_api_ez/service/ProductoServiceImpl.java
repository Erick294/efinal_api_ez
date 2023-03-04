package com.uce.efinal2_api_ez.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.efinal2_api_ez.repository.IRepositoryProducto;
import com.uce.efinal2_api_ez.repository.modelo.Producto;
import com.uce.efinal2_api_ez.service.to.ProductoTo;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    IRepositoryProducto repoProducto;

    @Override
    public void actualizarProducto(Integer id, Producto prod) {
        this.repoProducto.actualizarProducto(id, prod); 
    }

    @Override
    public void eliminarProducto(Integer id) {
        // TODO Auto-generated method stub
        this.repoProducto.eliminarProducto(id);
    }

    @Override
    public void insertarProducto(Producto prod) {
        // TODO Auto-generated method stub
        this.repoProducto.insertarProducto(prod);
    }

    @Override
    public ProductoTo obtenerId(Integer id) {
        // TODO Auto-generated method stub
        return convertir(this.repoProducto.obtenerId(id));
    }

    @Override
    public List<ProductoTo> obtenerProductos() {
        // TODO Auto-generated method stub
        List<Producto> lista = this.repoProducto.obtenerProductos();
        List<ProductoTo> listaTo = lista.stream().map(producto -> convertir(producto)).collect(Collectors.toList());
        return listaTo;
    }

    private ProductoTo convertir(Producto prod){
        ProductoTo prodTo = new ProductoTo();
        prodTo.setCodigoBarras(prod.getCodigoBarras());
        prodTo.setId(prod.getId());
        prodTo.setPrecioUnidad(prod.getPrecioUnidad());
        prodTo.setStock(prod.getStock());
        prodTo.setNombre(prod.getNombre());
        return prodTo;
    }
    
}
