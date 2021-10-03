package com.programacion_bcv.ejercicio5;

public class NodoListaBusqueda<T> {
    protected NodoLista<T> nodoAnterior;
    protected NodoLista<T> nodoActual;

    public NodoListaBusqueda() {
        this(null, null);
    }

    public NodoListaBusqueda(NodoLista<T> nodoAnterior, NodoLista<T> nodoActual) {
        this.nodoAnterior = nodoAnterior;
        this.nodoActual = nodoActual;
    }

    public void setNodoAnterior(NodoLista<T> nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }

    public void setNodoActual(NodoLista<T> nodoActual) {
        this.nodoActual = nodoActual;
    }
}
