package com.BS23.beanPersona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controlador {

    @Autowired
    @Qualifier("bean1")
            Persona persona1;

    @Autowired
    @Qualifier("bean2")
    Persona persona2;

    @Autowired
    @Qualifier("bean3")
    Persona persona3;

    @GetMapping("/controlador/bean/{bean}")

    public String bean(@PathVariable("bean") String bean){
        switch (bean){
            case "bean1":
                return persona1.getNombre();
            case "bean2":
                return persona2.getNombre();
            case "bean3":
                return persona3.getNombre();
        }
        return "Persona no encontrada";
    }
}
