package com.example.aulajpa;

import java.io.*;
import java.util.List;

import com.example.aulajpa.domain.entities.Veiculo;
import com.example.aulajpa.repository.VeiculoRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "veiculoServlet", value = "/veiculo")
public class VeiculoServlet extends HttpServlet {
    VeiculoRepository repository;

    public VeiculoServlet() {
        this.repository = new VeiculoRepository();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        List<Veiculo> veiculos = repository.findAll();

        request.setAttribute("attr_veiculos", veiculos);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/veiculo.jsp");

        try {
            dispatcher.forward(request, response);
        } catch (jakarta.servlet.ServletException e) {
            e.printStackTrace();
            System.out.println("Erro ao redirecionar para a página veiculo.jsp");
        }
    }

    public void destroy() {
    }
}