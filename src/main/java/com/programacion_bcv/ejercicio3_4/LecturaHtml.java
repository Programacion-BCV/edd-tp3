package com.programacion_bcv.ejercicio3_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LecturaHtml {
    public static void main(String[] args) throws Exception {
        List<RegistroAlturaRio> registroRios = new ArrayList<>();
        String auxPuerto = "";
        String auxRio = "";
        String auxUltimoRecurso = "";
        String auxFechaHora = "";
        String auxEstado = "";
        try {
            File archivo = new File("src/main/java/com/programacion_bcv/ejercicio3_4/contenidosweb-prefecturanaval.html");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            Pattern puerto = Pattern.compile("^(.*Puerto.*>(.+)<.*)$");
            Pattern rio = Pattern.compile("^(.*Río.*>(.+)<.*)$");
            Pattern ultimoRecurso = Pattern.compile("^(.*Ulti.*>(.+)<.*)$");
            Pattern fechaHora = Pattern.compile("^(.*Fecha H.*>(.+)</b.*)$");
            Pattern estado = Pattern.compile("^(.*Esta.*>(.+)<.*)$");

            Matcher match;

            String linea;
            int contadorObjeto = 0;

            while ((linea = br.readLine()) != null) {
                switch (contadorObjeto) {
                    case 0 -> {
                        match = puerto.matcher(linea);
                        if (match.matches()) {
                            auxPuerto = match.group(2);
                            contadorObjeto++;
                        }
                    }
                    case 1 -> {
                        match = rio.matcher(linea);
                        if (match.matches()) {
                            auxRio = match.group(2);
                            contadorObjeto++;
                        }
                    }
                    case 2 -> {
                        match = ultimoRecurso.matcher(linea);
                        if (match.matches()) {
                            auxUltimoRecurso = match.group(2);
                            contadorObjeto++;
                        }
                    }
                    case 3 -> {
                        match = fechaHora.matcher(linea);
                        if (match.matches()) {
                            auxFechaHora = match.group(2);
                            contadorObjeto++;
                        }
                    }
                    case 4 -> {
                        match = estado.matcher(linea);
                        if (match.matches()) {
                            auxEstado = match.group(2);
                            contadorObjeto++;
                        }
                    }
                }
                if (contadorObjeto == 5) {
                    registroRios.add(new RegistroAlturaRio(auxPuerto, auxRio, auxUltimoRecurso, auxFechaHora, auxEstado));
                    contadorObjeto = 0;
                }
            }
            System.out.println(registroRios);
            System.out.println(registroRios.size());
            fr.close();
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
}
