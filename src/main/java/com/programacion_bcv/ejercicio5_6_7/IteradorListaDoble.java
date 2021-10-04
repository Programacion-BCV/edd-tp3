package com.programacion_bcv.ejercicio5_6_7;

public class IteradorListaDoble<T> implements IteradorListaDobleInterfaz<T> {

    private NodoListaDoble<T> nodo;
    private int index;


    @Override
    public boolean existeSiguiente() {
        return nodo != null;
    }

    @Override
    public T siguiente() {
        T resultado = nodo.elemento;
        nodo = nodo.siguiente;
        index++;
        return resultado;
    }

    @Override
    public T primero() {
        return null;
    }

    @Override
    public boolean existeAnterior() {
        return nodo != null;
    }

    @Override
    public T anterior() {
        T resultado = nodo.elemento;
        nodo = nodo.anterior;
        index--;
        return resultado;
    }

    @Override
    public T ultimo() {
        return null;
    }
}



