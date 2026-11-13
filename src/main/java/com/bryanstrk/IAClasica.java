package com.bryanstrk;


public class IAClasica {

    public static String recomendarActividad(String clima, int temperatura, boolean esFinDeSemana) {

        if (clima.equals("soleado")) {
            if (temperatura > 30) {
                if (esFinDeSemana) {
                    return "Ir a la pileta";
                } else {
                    return "Tomar algo fresco";
                }
            } else if (temperatura > 20) {
                if (esFinDeSemana) {
                    return "Salir a pasear";
                } else {
                    return "Salir a caminar un rato";
                }
            } else {
                return "Abrigarse pero salir igual";
            }

        } else if (clima.equals("lluvia")) {
            if (esFinDeSemana) {
                return "Ver películas en casa";
            } else {
                return "Quedarse en casa trabajando";
            }

        } else if (clima.equals("nublado")) {
            if (temperatura > 25) {
                return "Salir igual, no hace tanto calor";
            } else {
                return "Quedarse en casa o salir poco";
            }

        } else {
            return "No se puede determinar la actividad";
        }
    }

}