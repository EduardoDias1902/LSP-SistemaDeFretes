package org.example.model;

public class Pedido {

    private final double valorBruto;

    public Pedido(double valorBruto) {
        if (valorBruto < 0) {
            throw new IllegalArgumentException("Valor bruto não pode ser negativo.");
        }
        this.valorBruto = valorBruto;
    }

    public double getValorBruto() {
        return valorBruto;
    }
}