package org.example.service;

import org.example.model.Pedido;
import org.example.strategy.EstrategiaDeFrete;

public class ProcessadorDePagamento {

    public void processar(Pedido pedido, EstrategiaDeFrete estrategia) {

        double valorFinal = estrategia.calcularValorFinal(pedido);

        if (valorFinal < pedido.getValorBruto()) {
            throw new IllegalStateException(
                    "Erro de contrato: valor final não pode ser menor que o valor bruto."
            );
        }

        System.out.println("Pedido processado com sucesso.");
        System.out.println("Valor bruto: R$ " + pedido.getValorBruto());
        System.out.println("Valor final: R$ " + valorFinal);
        System.out.println("------------------------------");
    }
}
