package com.mycompany.veiculo;

public class Flex extends Veiculo{
    public Flex(String modelo,double valor){
        super(modelo,valor);
    }
    @Override
    public double calcularConsumo(){
        return this.getValor() * 0.03;
    }
}
