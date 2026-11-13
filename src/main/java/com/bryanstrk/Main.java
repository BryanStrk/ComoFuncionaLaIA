package com.bryanstrk;

import java.util.ArrayList;
import java.util.List;

import static com.bryanstrk.IAClasica.recomendarActividad;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    static void main() {
//
//
//            String clima = "soleado";
//            int temperatura = 32;
//            boolean esFinDeSemana = true;
//
//            System.out.println(recomendarActividad(clima, temperatura, esFinDeSemana));
//
//
//
//        }
    public static void main(String[] args) {

            List<Dato> datos = new ArrayList<>();

            datos.add(new Dato(10, "Bajo"));
            datos.add(new Dato(20, "Bajo"));
            datos.add(new Dato(30, "Alto"));
            datos.add(new Dato(80, "Alto"));
            datos.add(new Dato(90, "Alto"));

            Clasificador clasificador = new Clasificador();

            int nuevaTemperatura = 10;

            String resultado = clasificador.clasificar(nuevaTemperatura, datos);

            System.out.println("Resultado: " + resultado);
        }
    }



