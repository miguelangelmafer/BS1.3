package com.BS23.beanPersona;

import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {
    Persona persona = new Persona();

    public String getNombre() {
        return persona.getNombre();
    }

    public void setNombre(String Nombre) {
        persona.setNombre(Nombre);
    }

    public String getCiudad() {
        return persona.getCiudad();
    }

    public void setCiudad(String Ciudad) {
        persona.setCiudad(Ciudad);
    }

    public Integer getEdad() {
        return persona.getEdad();
    }

    public void setEdad(Integer Edad) {
        persona.setEdad(Edad);
    }

}
