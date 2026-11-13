package com.bryanstrk;


public class Dato {

    private int temperatura;
    private String valor;

    public Dato(int temperatura, String valor) {
        this.temperatura = temperatura;
        this.valor = valor;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public String getValor() {
        return valor;
    }
}
