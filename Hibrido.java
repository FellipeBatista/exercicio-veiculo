package com.mycompany.veiculo;

public class Hibrido extends Veiculo{
    public Hibrido(String modelo,double valor){
        super(modelo,valor);
    }
    @Override
    public double calcularConsumo(){
        return this.getValor() * 0.02;
    }
}
