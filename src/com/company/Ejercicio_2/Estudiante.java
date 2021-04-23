package com.company.Ejercicio_2;

public class Estudiante extends Persona {

    private int anioIngreso;
    public double cuotaMensual;
    public String carrera;

    public Estudiante(String nombre,String apellido,String email,String direccion,
                      int anioIngreso,double cuotaMensual,String carrera)
    {
        super();//porque tengo que poner el super?
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        setDireccion(direccion);
        this.anioIngreso=anioIngreso;
        this.cuotaMensual=cuotaMensual;
        this.carrera=carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                "anioIngreso=" + anioIngreso +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +

                '}';
    }

    @Override
    public void hablar() {
        System.out.println("soy el estudiante"+this.nombre);
    }
}
