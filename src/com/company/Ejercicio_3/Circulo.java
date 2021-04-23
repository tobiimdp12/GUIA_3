package com.company.Ejercicio_3;

public class Circulo extends Figuras{


   private double radio;

   public Circulo(String color,double radio)
   {
       this.color=color;
       this.radio=radio;
   }

    public Circulo(double radio)
    {
        this.color=color;
        this.radio=radio;
    }
    @Override
    public double calcularArea() {
        return Math.round(3.14f * Math.pow(radio,2));
    }

    @Override
    public double calcularPerimetro() {
        return  Math.round(2*3.14f*radio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "color=" + color +
                ", color='" + radio + '\'' +
                ", area=" + calcularArea() +
                ", perimetro=" + calcularPerimetro() +
                '}';
    }
}
