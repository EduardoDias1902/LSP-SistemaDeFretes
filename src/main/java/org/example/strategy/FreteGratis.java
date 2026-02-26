package org.example.strategy;

import org.example.model.Pedido;
public class FreteGratis implements EstrategiaDeFrete {

    @Override
    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValorBruto();
    }
}