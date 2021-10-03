package com.programacion_bcv.ejercicio5;

public class NodoLista<T> {
    protected T elemento;
    protected NodoLista<T> siguiente;
    protected NodoLista<T> anterior;

    public NodoLista(T elemento, NodoLista<T> siguiente, NodoLista<T> anterior) {
        this.elemento = elemento;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NodoLista<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLista<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLista<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "NodoLista{" +
                "elemento=" + elemento +
                ", siguiente=" + siguiente +
                ", anterior=" + anterior +
                '}';
    }
}
