package com.mycompany.veiculo;

public abstract class Veiculo {
    private String modelo;
    private double valor;
    private static int totalVeiculos;
    public Veiculo(String modelo,double valor){
        this.modelo = modelo;
        this.valor = valor;
        totalVeiculos++;
}
    public String getModelo(){
        return this.modelo;
    }
    public double getValor(){
        return this.valor;
    }
    public abstract double calcularConsumo();
    public static int veiculosRegistrados(){
        return totalVeiculos;
    }
}
