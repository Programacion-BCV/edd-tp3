package com.programacion_bcv.ejercicio5;

public class IteradorListaDoble<T> implements IteradorListaDobleInterfaz<T> {
    private NodoLista<T> nodoActual;

    public IteradorListaDoble(NodoLista<T> header) {
        this.nodoActual = header;
    }


    @Override

    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void add(Object element) {

    }

    @Override
    public void remove(Object element) {

    }

    @Override
    public IteradorListaDobleInterfaz<T> iterador() {
        return null;
    }

    @Override
    public boolean existeSiguiente() {
        return nodoActual.getSiguiente() != null;
    }

    @Override
    public T siguiente() {
        T resultado = null;

        if (existeSiguiente()) {
            nodoActual = nodoActual.getSiguiente();
            resultado = nodoActual.getElemento();
        }
        return resultado;
    }

    @Override
    public T primero() {
        return null;
    }

    @Override
    public boolean existeAnterior() {
        return nodoActual.getAnterior() != null;
    }

    @Override
    public T anterior() {
        T resultado = null;

        if (existeAnterior()) {
            nodoActual = nodoActual.getAnterior();
            resultado = nodoActual.getElemento();
        }
        return resultado;
    }

    @Override
    public T ultimo() {
        return null;
    }
}



