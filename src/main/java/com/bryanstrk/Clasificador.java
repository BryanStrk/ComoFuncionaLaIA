package com.bryanstrk;


import java.util.List;

public class Clasificador {

    public String clasificar(int nuevaTemperatura, List<Dato> datos) {
        int suma = 0;

        for (Dato d : datos) {
            suma += d.getTemperatura();
        }

        int promedio = suma / datos.size();

        if (nuevaTemperatura >= promedio) {
            return "Alto";
        } else {
            return "Bajo";
        }
    }
}
