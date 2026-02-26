package org.example.app;

import org.example.model.Pedido;
import  org.example.service.ProcessadorDePagamento;
import org.example.strategy.EstrategiaDeFrete;
import org.example.strategy.FretePadrao;
import org.example.strategy.FreteGratis;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(100.0);
        ProcessadorDePagamento processador = new ProcessadorDePagamento();

        // Usando frete padrão
        EstrategiaDeFrete fretePadrao = new FretePadrao(20.0);
        processador.processar(pedido, fretePadrao);

        // Usando frete grátis
        EstrategiaDeFrete freteGratis = new FreteGratis();
        processador.processar(pedido, freteGratis);
    }
}
