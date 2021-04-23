package com.company.Ejercicio_3;

public class Cuadrado extends Rectangulo{

    public Cuadrado(String color, double alto, double ancho) {
        super(color, alto, ancho);
    }

    public Cuadrado( double alto, double ancho) {
        super(alto, ancho);
    }
    @Override
    public double calcularArea() {
        //lado por lado como un cuadrado tiene todos sus lados con
        // el mismo tamanio puedo multiplicar el alto por ancho
        return  Math.round(alto*ancho);
    }

    @Override
    public double calcularPerimetro() {
        return  Math.round(this.alto*2+this.ancho*2);//la suma de todos los lados
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "color='" + color + '\'' +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", area=" + calcularArea() +
                ", perimetro=" + calcularPerimetro() +
                '}';
    }
}
