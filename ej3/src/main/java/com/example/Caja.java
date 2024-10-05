package com.example;

public class Caja implements Componente {

    private double precio;

    public Caja(double p) {
        precio = p;
    }

    public double precio() {
        return precio;
    }

}