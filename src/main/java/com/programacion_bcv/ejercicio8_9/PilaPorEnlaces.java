package com.programacion_bcv.ejercicio8_y_9;

import ar.edu.uner.fcad.ed.edlineales.NodoLista;

public class PilaPorEnlaces<T> {
    protected NodoPila<T> tope;

    public PilaPorEnlaces() {
        this.makeEmpty();
    }

    public boolean isEmpty() {
        return this.tope == null;
    }

    public boolean isFull() {
        return false;
    }

    public void makeEmpty() {
        this.tope = null;
    }

    public T top() {
        return (isEmpty() ? null : tope.getElemento());
    }

    public void pop() {
        this.tope = this.tope.getSiguiente();
    }

    public void push(T elemento) {
        if (isEmpty()) {
            this.tope = new NodoPila<>(elemento);
        } else {
            NodoPila<T> nuevoNodo = new NodoPila<>(elemento);
            nuevoNodo.setSiguiente(this.tope);
            this.tope = nuevoNodo;
        }
    }

    @Override
    public String toString() {
        String resultado = "";

        NodoPila<T> nodoActual = tope;
        while (nodoActual != null) {
            resultado += ", " + nodoActual.toString();
            nodoActual = nodoActual.getSiguiente();
        }

        if (resultado.length() > 0) {
            resultado = resultado.substring(2);
        }

        return resultado;
    }
}
