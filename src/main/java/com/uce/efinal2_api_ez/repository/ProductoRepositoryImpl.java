package com.uce.efinal2_api_ez.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.efinal2_api_ez.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoRepositoryImpl implements IRepositoryProducto{

    @PersistenceContext
    private EntityManager entity;

    @Override
    public void actualizarProducto(Integer id, Producto prod) {
        // TODO Auto-generated method stub
        prod.setId(this.obtenerId(id).getId());
        entity.merge(prod);
    }
    @Override
    public Producto obtenerId(Integer id){
        TypedQuery<Producto> myQuery = this.entity.createQuery("SELECT p FROM Producto p WHERE p.id = :id", Producto.class);
		myQuery.setParameter("id", id);
		return myQuery.getSingleResult();
    }

    @Override
    public void eliminarProducto(Integer id) {
        // TODO Auto-generated method stub
        this.entity.detach(id);
    }

    @Override
    public void insertarProducto(Producto prod) {
        // TODO Auto-generated method stub
        this.entity.merge(prod);
    }

    @Override
    public List<Producto> obtenerProductos() {
        // TODO Auto-generated method stub
        TypedQuery<Producto> myQuery = this.entity.createQuery("SELECT p FROM Producto p", Producto.class);
		return myQuery.getResultList();
    }
    
}
