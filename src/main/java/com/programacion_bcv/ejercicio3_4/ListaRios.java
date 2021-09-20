package com.programacion_bcv.ejercicio3_4;

import java.util.ArrayList;
import java.util.List;

public class ListaRios {
    private List<RegistroAlturaRio> registroRios;

    public ListaRios() {
        this.registroRios = new ArrayList<>();
    }

    public int size() {
        return this.registroRios.size();
    }

    public void add(RegistroAlturaRio r) {
        this.registroRios.add(r);
    }

    public RegistroAlturaRio get(int index) {
        return registroRios.get(index);
    }

    public RegistroAlturaRio remove(int index) {
        return registroRios.remove(index);
    }

    public List<RegistroAlturaRio> filtrarPorPuerto(String nombrePuerto) {
        List<RegistroAlturaRio> retorno = new ArrayList<>();

        for (RegistroAlturaRio registro : this.registroRios) {
            if (registro.getPuerto().equals(nombrePuerto)) {
                retorno.add(registro);
            }
        }
        return retorno;
    }

    public List<RegistroAlturaRio> filtrarPorRio(Rio rio) {
        List<RegistroAlturaRio> retorno = new ArrayList<>();

        for (RegistroAlturaRio registro : this.registroRios) {

            if (registro.getRio().equals(rio)) {
                retorno.add(registro);
            }
        }
        return retorno;
    }

    public List<RegistroAlturaRio> filtrarPorEstado(EstadoEnum estado) {
        List<RegistroAlturaRio> retorno = new ArrayList<>();

        for (RegistroAlturaRio registro : this.registroRios) {
            if (registro.getEstado().getDescripcion().equals(estado.getDescripcion())) {
                retorno.add(registro);
            }
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "ListaRios{" +
                "registroRios=" + registroRios +
                '}';
    }
}
