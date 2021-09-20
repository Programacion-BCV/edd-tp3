package com.programacion_bcv.ejercicio3_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientePrefectura {
    public static void main(String[] args) {
        ListaRios lista = new ListaRios();

        String auxPuerto = "";
        String auxRio = "";
        String auxUltimoRecurso = "";
        String auxFechaHora = "";
        String auxEstado = "";

        Pattern puerto = Pattern.compile("^(.*Pue.*>(.+)<.*)$");
        Pattern rio = Pattern.compile("^(.*Río.*>(.+)<.*)$");
        Pattern ultimoRecurso = Pattern.compile("^(.*Ult.*>(.+)<.*)$");
        Pattern fechaHora = Pattern.compile("^(.*Fecha H.*>(.+)</b.*)$");
        Pattern estado = Pattern.compile("^(.*Est.*>(.+)<.*)$");

        Matcher match;

        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            file = new File("src/main/java/com/programacion_bcv/ejercicio3_4/contenidosweb-prefecturanaval.html");
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String linea;
            int contadorObjeto = 0;

            while ((linea = bufferedReader.readLine()) != null) {
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
                    lista.add(new RegistroAlturaRio(auxPuerto, new Rio(auxRio), auxUltimoRecurso, auxFechaHora, (auxEstado.equals("CRECE") ? EstadoEnum.CRECE : (auxEstado.equals("BAJA") ? EstadoEnum.BAJA : (auxEstado.equals("ESTAC.") ? EstadoEnum.ESTAC : EstadoEnum.SE)))));
                    contadorObjeto = 0;
                }
            }
            System.out.println(lista.filtrarPorPuerto("FEDERACION"));
            System.out.println(lista.filtrarPorRio(new Rio("PARANA")));
            System.out.println(lista.filtrarPorEstado(EstadoEnum.CRECE));
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            try {
                if (null != fileReader) {
                    fileReader.close();
                }
            } catch (Exception exc2) {
                exc2.printStackTrace();
            }
        }
    }
}
