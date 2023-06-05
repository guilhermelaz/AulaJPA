package com.example.aulajpa.repository;

import com.example.aulajpa.connection.ConnectionFactory;
import com.example.aulajpa.domain.entities.Acessorio;
import com.example.aulajpa.domain.entities.Proprietario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class AcessorioRepository {

    private EntityManager entityManager;

    public AcessorioRepository(){
        this.entityManager = ConnectionFactory.getConnection();
    }

    public Acessorio findById(Integer id){
        return entityManager.find(Acessorio.class, id);
    }

    public List<Acessorio> findAll(){

        Query query = entityManager.createNativeQuery("select * from Acessorio", Acessorio.class);
        List<Acessorio> acessorios = query.getResultList();

        return acessorios;
    }


    public void persist(Acessorio acessorio){
        entityManager.getTransaction().begin();
        entityManager.persist(acessorio);
        entityManager.getTransaction().commit();
    }

    public void remove(Acessorio acessorio){
        entityManager.getTransaction().begin();
        entityManager.remove(acessorio);
        entityManager.getTransaction().commit();
    }

    public void update(Acessorio acessorio){
        entityManager.getTransaction().begin();

        acessorio = entityManager.merge(acessorio);

        entityManager.persist(acessorio);
        entityManager.getTransaction().commit();
    }

}
