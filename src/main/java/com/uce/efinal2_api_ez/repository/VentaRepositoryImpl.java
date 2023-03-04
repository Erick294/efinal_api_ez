package com.uce.efinal2_api_ez.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.efinal2_api_ez.repository.modelo.Venta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VentaRepositoryImpl implements IRepositoryVenta{

    @PersistenceContext
    private EntityManager entity;
    
    @Override
    public void actualizarVenta(Integer id, Venta vent) {
        // TODO Auto-generated method stub
        vent.setId(this.obtenerId(id).getId());
        entity.merge(vent);
    }

    @Override
    public void eliminarVenta(Integer id) {
        // TODO Auto-generated method stub
        this.entity.detach(id);
    }

    @Override
    public void insertarVenta(Venta prod) {
        // TODO Auto-generated method stub
        this.entity.merge(prod);
    }

    @Override
    public Venta obtenerId(Integer id) {
        // TODO Auto-generated method stub
        TypedQuery<Venta> myQuery = this.entity.createQuery("SELECT v FROM Venta v WHERE v.id = :id", Venta.class);
		myQuery.setParameter("id", id);
		return myQuery.getSingleResult();
    }

    @Override
    public List<Venta> obtenerVenta() {
        // TODO Auto-generated method stub
        TypedQuery<Venta> myQuery = this.entity.createQuery("SELECT v FROM Venta v", Venta.class);
		return myQuery.getResultList();
    }
    
}
