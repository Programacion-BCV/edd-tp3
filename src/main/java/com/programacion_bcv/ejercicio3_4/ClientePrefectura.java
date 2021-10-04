package com.programacion_bcv.ejercicio3_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientePrefectura {
    public static void main(String[] args) {
        ListaRios listaRios = new ListaRios();

        String auxPuerto = "";
        String auxRio = "";
        String auxUltimoRecurso = "";
        String auxFechaHora = "";
        String auxEstado = "";

        Pattern patron = Pattern.compile("^(.*(Pue|Río|Ult|Fecha H|Est).*>(.+)(?<!</b>)<.*)$");

        Matcher match;

        File file;
        FileReader fileReader = null;
        BufferedReader bufferedReader;
        try {
            file = new File("src/main/java/com/programacion_bcv/ejercicio3_4/contenidosweb-prefecturanaval.html");
            fileReader = new FileReader(file, StandardCharsets.UTF_8);
            bufferedReader = new BufferedReader(fileReader);

            String linea;
            int contadorObjeto = 0;

            while ((linea = bufferedReader.readLine()) != null) {
                switch (contadorObjeto) {
                    case 0 -> {
                        match = patron.matcher(linea);
                        if (match.matches()) {
                            auxPuerto = match.group(3);
                            contadorObjeto++;
                        }
                    }
                    case 1 -> {
                        match = patron.matcher(linea);
                        if (match.matches()) {
                            auxRio = match.group(3);
                            contadorObjeto++;
                        }
                    }
                    case 2 -> {
                        match = patron.matcher(linea);
                        if (match.matches()) {
                            auxUltimoRecurso = match.group(3);
                            contadorObjeto++;
                        }
                    }
                    case 3 -> {
                        match = patron.matcher(linea);
                        if (match.matches()) {
                            auxFechaHora = match.group(3);
                            contadorObjeto++;
                        }
                    }
                    case 4 -> {
                        match = patron.matcher(linea);
                        if (match.matches()) {
                            auxEstado = match.group(3);
                            contadorObjeto++;
                        }
                    }
                }
                if (contadorObjeto == 5) {
                    listaRios.add(new RegistroAlturaRio(auxPuerto, new Rio(auxRio), auxUltimoRecurso, auxFechaHora, (auxEstado.equals("CRECE") ? EstadoEnum.CRECE : (auxEstado.equals("BAJA") ? EstadoEnum.BAJA : (auxEstado.equals("ESTAC.") ? EstadoEnum.ESTAC : EstadoEnum.SE)))));
                    contadorObjeto = 0;
                }
            }
            System.out.println("***************> Lista Rios <***************");
            System.out.println(listaRios);
            System.out.println("****************************************");
            System.out.println("***************> Lista Rios por Puerto<***************");
            System.out.println(listaRios.filtrarPorPuerto("FEDERACION"));
            System.out.println("****************************************");
            System.out.println("***************> Lista Rios por Rio<***************");
            System.out.println(listaRios.filtrarPorRio(new Rio("PARANA")));
            System.out.println("****************************************");
            System.out.println("***************> Lista Rios por Estado<***************");
            System.out.println(listaRios.filtrarPorEstado(EstadoEnum.CRECE));
            System.out.println("****************************************");
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
