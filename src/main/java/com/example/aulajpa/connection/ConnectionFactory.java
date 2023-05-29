package com.example.aulajpa.connection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnectionFactory {

    private static EntityManagerFactory entityManagerFactory;

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("ifpr_aula_jpa");
    }

    public static EntityManager getConnection(){
        return entityManagerFactory.createEntityManager();
    }

}
