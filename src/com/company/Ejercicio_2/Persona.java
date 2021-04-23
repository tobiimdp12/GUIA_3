package com.company.Ejercicio_2;

import java.lang.reflect.Array;
import java.util.UUID;
public abstract class  Persona {
    protected String nombre;
    protected String apellido;
    protected String email;
    private String direccion;
    private String dni=UUID.randomUUID().toString().substring(0, 8);//genero un codigo random de 8 caracteres;

    public abstract void hablar();


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }




}
