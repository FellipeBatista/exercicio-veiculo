package com.mycompany.veiculo;
import java.util.ArrayList;

public class Eletrico extends Veiculo{
    public Eletrico(String modelo,double valor){
        super(modelo,valor);
    }
    @Override
    public double calcularConsumo(){
        return this.getValor() * 0.01;
    }
    public static void main(String[] args){
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Eletrico("BYD Dolphin Mini",118.990));
        veiculos.add(new Hibrido("BYD King GL",172.990));
        veiculos.add(new Eletrico("BYD Dolphin",149.990));
        veiculos.add(new Eletrico("GWM Ora 5",159.990));
        veiculos.add(new Flex("Fiat Argo 1.0 Flex",89.990));
        veiculos.add(new Flex("Hyundai HB20 Comfort Plus 1.0 Flex",95.590));
        veiculos.add(new Hibrido("BYD Song Pro GL",189.990));
        veiculos.add(new Flex("Chevrolet Onix 1.0 Flex",98.290));
        veiculos.add(new Hibrido("GWM Haval H6 HEV",219.000));
        
        for(Veiculo v : veiculos){
            System.out.println("Modelo do veículo: " + v.getModelo() + " Valor: R$" + v.getValor() + " Consumo: R$" + v.calcularConsumo());
        }
        System.out.println("Veículos registrados: " + Veiculo.veiculosRegistrados());
    }
        
}
