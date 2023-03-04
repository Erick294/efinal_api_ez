package com.uce.efinal2_api_ez.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.efinal2_api_ez.repository.modelo.DetalleVenta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DetalleVentaRepositoryImpl implements IRepositoryDetalleVenta{

    @PersistenceContext
    private EntityManager entity;
    
    @Override
    public void actualizarProducto(Integer id, DetalleVenta det) {
        // TODO Auto-generated method stub
        det.setId(this.obtenerId(id).getId());
        entity.merge(det);
    }

    @Override
    public void insertarProducto(DetalleVenta det) {
        // TODO Auto-generated method stub
        this.entity.merge(det);
    }

    @Override
    public DetalleVenta obtenerId(Integer id) {
        // TODO Auto-generated method stub
        TypedQuery<DetalleVenta> myQuery = this.entity.createQuery("SELECT v FROM DetalleVenta v WHERE v.id = :id", DetalleVenta.class);
		myQuery.setParameter("id", id);
		return myQuery.getSingleResult();
    }

    @Override
    public List<DetalleVenta> obtenerProductos() {
        // TODO Auto-generated method stub
        TypedQuery<DetalleVenta> myQuery = this.entity.createQuery("SELECT v FROM DetalleVenta v", DetalleVenta.class);
		return myQuery.getResultList();
    }
    
}
