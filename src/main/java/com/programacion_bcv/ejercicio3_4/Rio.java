package com.programacion_bcv.ejercicio3_4;

import java.util.Objects;

public class Rio {
    private String descripcion;

    public Rio(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rio rio = (Rio) o;
        return descripcion.equals(rio.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion);
    }

    @Override
    public String toString() {
        return "Rio{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}
