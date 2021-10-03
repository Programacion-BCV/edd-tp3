package com.programacion_bcv.ejercicio3_4;

public enum EstadoEnum {
    CRECE("CRECE"), BAJA("BAJA"), ESTAC("ESTACIONADO"), SE("SIN REGISTRO");

    private final String descripcion;

    EstadoEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "EstadoEnum{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}
