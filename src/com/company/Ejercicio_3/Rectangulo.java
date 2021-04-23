package com.company.Ejercicio_3;

public class Rectangulo extends Figuras {


    protected double alto;
    protected double ancho;

    public Rectangulo(String color,double alto,double ancho)
    {
        this.color=color;
        this.alto=alto;
        this.ancho=ancho;
    }
    public Rectangulo(double alto,double ancho)
    {

        this.alto=alto;
        this.ancho=ancho;
    }
    @Override
    public double calcularArea() {
        return  Math.round(alto*ancho);
    }

    @Override
    public double calcularPerimetro() {
        return  Math.round(2*alto+2*ancho);//la suma de todos sus lados
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "color='" + color + '\'' +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", area=" + calcularArea() +
                ", perimetro=" + calcularPerimetro() +
                '}';
    }
}
