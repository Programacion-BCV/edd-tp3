package com.programacion_bcv.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class ValidadorTelefonoMovil {
    public static void main(String[] args) {
        List<String> telefonos = new ArrayList<>();
        Pattern p = Pattern.compile("^((\\(|\\+)?([5][4]|[5][4][9])?[0]?[3][4][5]\\)?\\s?([1][5])?\\d{7})$");
        Matcher m;

        telefonos.add("(0345) 154123456");
        telefonos.add("+5493454123456");
        telefonos.add("3454123456");
        telefonos.add("+54011123456");
        telefonos.add("34564123456");

        for (String telefono : telefonos) {
            m = p.matcher(telefono);
            System.out.println(m.matches());
        }

    }

}
