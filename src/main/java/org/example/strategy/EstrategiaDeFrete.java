package org.example.strategy;

import org.example.model.Pedido;

public interface EstrategiaDeFrete {

    double calcularValorFinal(Pedido pedido);
}
