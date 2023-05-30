package com.example.aulajpa.repository;

import com.example.aulajpa.connection.ConnectionFactory;
import com.example.aulajpa.domain.entities.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.transaction.Transaction;

public class VeiculoRepository {

    private EntityManager entityManager;
    private EntityTransaction transaction;

    public VeiculoRepository(){
        this.entityManager = ConnectionFactory.getConnection();
        this.transaction = this.entityManager.getTransaction();
    }

    public Veiculo create(Veiculo veiculo){

        transaction.begin();
        entityManager.persist(veiculo);
        transaction.commit();

        return veiculo;
    }

    public Veiculo findById(Long id){

        Veiculo veiculo = entityManager.find(Veiculo.class, id);

        return veiculo;
    }

    public Veiculo update(Veiculo veiculo){

        transaction.begin();

        veiculo = entityManager.merge(veiculo);

        transaction.commit();

        return veiculo;

    }




}
