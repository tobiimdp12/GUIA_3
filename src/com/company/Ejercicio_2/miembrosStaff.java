package com.company.Ejercicio_2;

import java.util.Scanner;

public class miembrosStaff extends Persona{
    private int remuneracion;
    private String nombreInstitucion;
    private String turno;
    public miembrosStaff(String nombre,String apellido,String email,String direccion,
                         int remuneracion,String nombreInstitucion,String turno)
    {
        super();//porque tengo que poner el super?
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        setDireccion(direccion);
        this.remuneracion=remuneracion;
        this.nombreInstitucion=nombreInstitucion;

        if (turno !="Maniana" && turno!= "Noche")
        {
            do {
               System.out.println("Usted a ingresado un turno incorrecto intentelo de nuevo");
               Scanner newTurno= new Scanner(System.in);
               turno=newTurno.nextLine();
            }while (turno !="Maniana" && turno!= "Noche");
        }else
        {
            this.turno=turno;
        }


    }

    @Override
    public String toString() {
        return "miembrosStaff{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", remuneracion=" + remuneracion +
                ", nombreInstitucion='" + nombreInstitucion + '\'' +
                ", turno=" + turno +
                '}';
    }

    @Override
    public void hablar() {
        System.out.println("soy el empleado"+this.nombre);

    }
}
