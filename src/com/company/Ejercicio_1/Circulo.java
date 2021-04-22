package com.company.Ejercicio_1;

public class Circulo {
    protected double radio=1.0;
    protected String color="red";

    public  Circulo(double radio,String color)
    {
        this.radio=radio;
        this.color=color;
    }

    public  Circulo()
    {

    }
    public  double calcularArea()
    {
        //A=pi * radio^2
        return 3.14f * Math.pow(radio,2);
    }
    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
