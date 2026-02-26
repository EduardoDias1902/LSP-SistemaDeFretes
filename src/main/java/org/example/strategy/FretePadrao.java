package org.example.strategy;

import org.example.model.Pedido;
public class FretePadrao implements EstrategiaDeFrete {

    private final double valorFrete;

    public FretePadrao(double valorFrete) {
        if (valorFrete < 0) {
            throw new IllegalArgumentException("Frete não pode ser negativo.");
        }
        this.valorFrete = valorFrete;
    }

    @Override
    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValorBruto() + valorFrete;
    }
}
