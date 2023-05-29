package com.example.aulajpa;

import com.example.aulajpa.connection.ConnectionFactory;
import com.example.aulajpa.domain.entities.Veiculo;
import com.example.aulajpa.repository.VeiculoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.math.BigDecimal;

public class AppTest {


    public static void main(String[] args) {

        VeiculoRepository repository = new VeiculoRepository();

        Veiculo v1 = new Veiculo();

        v1.setModelo("Fusca");
        v1.setFabricante("VolksWagen");
        v1.setAnoFabricacao(1989);
        v1.setAnoModelo(1990);
        v1.setValor(new BigDecimal("15000.00"));

        repository.create(v1);

    }

}
