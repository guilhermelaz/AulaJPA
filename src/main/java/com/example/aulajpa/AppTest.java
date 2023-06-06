package com.example.aulajpa;

import com.example.aulajpa.domain.entities.Acessorio;
import com.example.aulajpa.domain.entities.Proprietario;
import com.example.aulajpa.domain.entities.Veiculo;
import com.example.aulajpa.domain.enums.TipoCombustivel;
import com.example.aulajpa.repository.AcessorioRepository;
import com.example.aulajpa.repository.ProprietarioRepository;
import com.example.aulajpa.repository.VeiculoRepository;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.List;

public class AppTest {


    public static void main(String[] args) {

        VeiculoRepository veiculoRepository = new VeiculoRepository();
        ProprietarioRepository proprietarioRepository = new ProprietarioRepository();
        AcessorioRepository acessorioRepository = new AcessorioRepository();

        Acessorio a1 = new Acessorio();

        a1.setDescricao("Ar condicionado");
        acessorioRepository.persist(a1);

        Acessorio a2 = new Acessorio();

        a2.setDescricao("Vidro elétrico");
        acessorioRepository.persist(a2);

        Acessorio a3 = new Acessorio();

        a3.setDescricao("Trava elétrica");
        acessorioRepository.persist(a3);


        Veiculo veiculoFound = veiculoRepository.findById(1L);
        veiculoFound.setAcessorio(a1);
        veiculoFound.setAcessorio(a2);
        veiculoFound.setAcessorio(a3);
        veiculoRepository.update(veiculoFound); // transação confirma a alteração no banco de dados

        Veiculo veiculoFound2 = veiculoRepository.findById(2L);
        veiculoFound.setAcessorio(a1);
        veiculoFound.setAcessorio(a3);
        veiculoRepository.update(veiculoFound2); // transação confirma a alteração no banco de dados


//        Proprietario p1 = new Proprietario();
//        p1.setNome("Guilherme");
//        p1.setEmail("guilherme_laz@hotmail.com");
//        p1.setPassword("bruh");
//
//        proprietarioRepository.persist(p1);
//
//
//        Veiculo v1 = new Veiculo();
//
//        v1.setModelo("Spin");
//        v1.setFabricante("Chevrolet");
//        v1.setAnoFabricacao(2012);
//        v1.setAnoModelo(2013);
//        v1.setValor(new BigDecimal("30000.00"));
//        v1.setTipoCombustivel(TipoCombustivel.GASOLINA);
//
//        v1.setProprietario(p1);
//
//        veiculoRepository.create(v1);
//
//
//        Veiculo v2 = new Veiculo();
//
//        v2.setModelo("Uno");
//        v2.setFabricante("Fiat");
//        v2.setAnoFabricacao(1994);
//        v2.setAnoModelo(1994);
//        v2.setValor(new BigDecimal("6000.00"));
//        v2.setTipoCombustivel(TipoCombustivel.GASOLINA);
//
//        v2.setProprietario(p1);
//
//        veiculoRepository.create(v2);



//        List<Proprietario> proprietarios = proprietarioRepository.findAll();
//
//        for (Proprietario proprietario : proprietarios) {
//            System.out.println(proprietario.getNome());
//            System.out.println(proprietario.getEmail());
//            for (Veiculo veiculo : proprietario.getVeiculos()) {
//                System.out.println(veiculo.getModelo());
//                System.out.println(veiculo.getFabricante());
//            }
//        }






    }
}
