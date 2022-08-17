package model;

public class CalculadoraModel {
    // manipula os valores da soma de numeros
    // inseridos na view

    private int calculadoraValor;

    public void addDoisNumeros(int primeiroNumero, int segundoNumero){

        calculadoraValor = primeiroNumero + segundoNumero;

    }

    public int getcalculadoraValor(){

        return calculadoraValor;

    }
}
