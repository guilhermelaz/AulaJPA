package com.example.aulajpa;

import com.example.aulajpa.connection.ConnectionFactory;
import com.example.aulajpa.domain.entities.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.math.BigDecimal;

public class AppTest {


    public static void main(String[] args) {

        EntityManager em = ConnectionFactory.getConnection();

        em.getTransaction().begin();

        Veiculo v1 = new Veiculo();

        //v1.setCodigo(1L);
        v1.setModelo("Fusca");
        v1.setFabricante("VolksWagen");
        v1.setAnoFabricacao(1989);
        v1.setAnoModelo(1990);
        v1.setValor(new BigDecimal("15000.00"));

        em.getTransaction().commit();

        em.persist(v1);

        Veiculo v2 = em.find(Veiculo.class, 1);

        System.out.println(v2.getModelo() + "  " + v2.getFabricante());


    }

}
