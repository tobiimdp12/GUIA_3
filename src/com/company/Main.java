package com.company;

import com.company.Ejercicio_1.Cilindro;

import com.company.Ejercicio_2.Estudiante;
import com.company.Ejercicio_2.miembrosStaff;



public class Main {

    public static void main(String[] args) {
	// write your code here

        Cilindro cilindro=new Cilindro();

        cilindro.mostrarValores();

System.out.println("\n----------------- \n");
        Cilindro cilindro2=new Cilindro(2,"blue",23);
        System.out.println(""+cilindro2.calcularArea());
        System.out.println(""+cilindro2.calcularVolumen());
        System.out.println(cilindro2.toString());
        cilindro2.mostrarValores();

        System.out.println("Ejercicio 2");
        Estudiante est=new Estudiante("tob","selva","TOBI","eyy",2,3444,"programacion");
        Estudiante est_2=new Estudiante("tobias","ruiz","tobias","ess",24,222,"derecho");
        Estudiante est_3=new Estudiante("tomas","fafafa","tomas","edsd",1,323,"economia");
        Estudiante est_4=new Estudiante("tony","montana","tony","esfs",200,14000,"ing informatica");

        miembrosStaff miembroStaff=new miembrosStaff("tob","selva","TOBI","eyy",2,"escuela23","Maniana");
        miembrosStaff miembroStaff_2=new miembrosStaff("tobias","ruiz","tobias","ess",24,"escuela231","Noche");
        miembrosStaff miembroStaff_3=new miembrosStaff("tomas","fafafa","tomas","edsd",1,"323","Noche");
        miembrosStaff miembroStaff_4=new miembrosStaff("tony","montana","tony","esfs",200,"14000","Maniana");


        Object listadoEyM[]=new Object[8];
        listadoEyM[0]=est;
        listadoEyM[1]=est_2;
        listadoEyM[2]=est_3;
        listadoEyM[3]=est_4;
        listadoEyM[4]=miembroStaff;
        listadoEyM[5]=miembroStaff_2;
        listadoEyM[6]=miembroStaff_3;
        listadoEyM[7]=miembroStaff_4;

        recorrerArray(listadoEyM);
        System.out.println("el ingreso que persive la escuela con las cuotas es de "
                + sumarIngresoCuotas(listadoEyM));

    }
//preguntar como se representa esto en el UML (EL FILE MAIN)
    public static void recorrerArray(Object arr[])
    {
        int cantEstudiantes=1;
        int cantMiembStaff=1;
        for (Object actualObj: arr) {
            if(actualObj instanceof Estudiante)
            {
                System.out.println("Estudiante numero : "+cantEstudiantes++);

                System.out.println(actualObj.toString());
            }else
            {
                System.out.println("Empleado numero : "+cantMiembStaff++);
                System.out.println(actualObj.toString());
            }
        }

    }

    public static int sumarIngresoCuotas(Object arr[])
    {
        int ingresoCuotas=0;

        for (Object actualObj: arr) {
            if(actualObj instanceof Estudiante)
            {
                Estudiante estudianteAc= (Estudiante) actualObj;

                ingresoCuotas+=estudianteAc.cuotaMensual;
            }
        }
        return ingresoCuotas;
    }
}


