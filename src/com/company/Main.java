package com.company;

import com.company.Ejercicio_1.Cilindro;
import com.company.Ejercicio_1.Circulo;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cilindro cilindro=new Cilindro();

        cilindro.mostrarValores();

System.out.println("\n----------------- \n");
        Cilindro cilindro2=new Cilindro(2,"blue",23);
        System.out.println(""+cilindro2.calcularArea());
        System.out.println(""+cilindro2.calcularVolumen());

        cilindro2.mostrarValores();
        System.out.println(cilindro2.toString());

    }


}


