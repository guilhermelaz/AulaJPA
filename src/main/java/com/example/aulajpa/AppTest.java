package com.example.aulajpa;

import com.example.aulajpa.domain.entities.Veiculo;
import com.example.aulajpa.domain.enums.TipoCombustivel;
import com.example.aulajpa.repository.VeiculoRepository;

import java.math.BigDecimal;
import java.util.List;

public class AppTest {


    public static void main(String[] args) {

        VeiculoRepository repository = new VeiculoRepository();

        Veiculo v1 = new Veiculo();

        v1.setModelo("Escort");
        v1.setFabricante("VolksWagen");
        v1.setAnoFabricacao(1989);
        v1.setAnoModelo(1990);
        v1.setValor(new BigDecimal("15000.00"));
        v1.setTipoCombustivel(TipoCombustivel.GASOLINA);

        //repository.create(v1);

        //Veiculo vf = repository.findById(2L);
        //System.out.println(vf.getModelo() + " - " + vf.getFabricante());

        /*
        v1.setCodigo(99L);
        v1.setModelo("Saveiro");
        v1.setAnoModelo(2023);

        repository.remove(v1);
        */

        /*List<Veiculo> veiculos = repository.findAll();

        veiculos.forEach( veiculo -> {
            System.out.println(veiculo.getModelo());
        });
        */

/*        Veiculo veiculoBuscado1 = repository.findById(2L);


        Veiculo veiculoBuscado2 = repository.findById(2L);

        if (veiculoBuscado1 == veiculoBuscado2){
            System.out.println("veiculos iguais");
        }

 */

        /*
        List<Veiculo> veiculos = repository.findAll();

        veiculos.forEach( veiculo -> {
            System.out.println(veiculo);
        });*/

        Veiculo ve = repository.findById(5L);

        System.out.println(ve);

    }
}
