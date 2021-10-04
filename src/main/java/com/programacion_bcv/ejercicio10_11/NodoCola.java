package com.programacion_bcv.ejercicio10_11;

public class NodoCola<T> {
    protected T elemento;
    protected NodoCola<T> siguiente;

    public NodoCola(T elemento, NodoCola<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public NodoCola(T elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NodoCola<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return this.elemento.toString();
    }
}
