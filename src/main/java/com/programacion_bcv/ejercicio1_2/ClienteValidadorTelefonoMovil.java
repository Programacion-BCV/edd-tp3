package com.programacion_bcv.ejercicio1_2;

import java.util.ArrayList;
import java.util.List;

public class ClienteValidadorTelefonoMovil {
    public static void main(String[] args) {
        List<String> telefonos = new ArrayList<>();
        telefonos.add("(0345) 154123456");
        telefonos.add("+5493454123456");
        telefonos.add("3454123456");
        telefonos.add("+54011123456");
        telefonos.add("34564123456");

        for (String telefono : telefonos) {
            try {
                ValidadorTelefonoMovil v1 = new ValidadorTelefonoMovil(telefono);
                System.out.println(telefono + " es un numero valido");
            } catch (Exception exc) {
                System.out.println(exc.getMessage());
            }
        }
    }
}
