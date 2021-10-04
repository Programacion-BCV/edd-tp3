package com.programacion_bcv.ejercicio8_9;

public class NodoPila<T> {
    protected T elemento;
    protected NodoPila<T> siguiente;

    public NodoPila(T elemento, NodoPila<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public NodoPila(T elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NodoPila<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return this.elemento.toString();
    }
}
