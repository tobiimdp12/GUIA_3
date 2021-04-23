package com.company.Ejercicio_1;

import com.company.Ejercicio_2.Estudiante;

public class Cilindro extends Circulo{
    public double altura=1.0f;


    public Cilindro()
    {

    }
    public Cilindro(double radio,String color,double altura)
    {
        super(radio,color);
        this.altura=altura;

    }
    @Override
    public double calcularArea() {
        return (2*3.14f*this.radio*this.altura)+(2*super.calcularArea());
    }

    public double calcularVolumen()
    {
        return super.calcularArea()*altura;
    }


    @Override
    public String toString() {
        return String.format("Cilindro: subclase de + {%s} +altura= {%.0f}"
                ,super.toString(),this.altura);
    }

    public void mostrarValores()
    {
        System.out.println("radio-->"+this.radio);
        System.out.println("altura-->"+this.altura);
        //como el circulo es la base del cilindro podemos decir que con calcular el
        // area de un circulo podemos obtener el area base del cilindro
        System.out.println(String.format("area-->%.0f",this.calcularArea()));
        System.out.println(String.format("volumen-->%.0f",this.calcularVolumen()));

    }
}
