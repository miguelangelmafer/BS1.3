package com.BS23.beanPersona;

public class Persona {
    private String nombre;
    private String ciudad;
    private Integer edad;

    public Persona(String nombre, String ciudad,Integer edad){
        this.nombre=nombre;
        this.ciudad=ciudad;
        this.edad = edad;
    }

    public Persona(){

    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
