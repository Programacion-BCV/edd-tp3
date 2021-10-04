package com.programacion_bcv.ejercicio8_9;

import ar.edu.uner.fcad.ed.edlineales.NodoLista;

public class PilaPorEnlaces<T> implements Pila<T> {

    protected NodoLista<T> tope;

    public PilaPorEnlaces() {
        makeEmpty();
    }

    /**
     * Indica si la estructura est� vac�a
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return tope == null;
    }

    /**
     * Indica si la estructura est� llena
     *
     * @return
     */
    @Override
    public boolean isFull() {
        return false;
    }

    /**
     * Retorna el elemento ubicado en la posici�n tope de la pila.
     *
     * @return
     */
    @Override
    public T top() {
        if (isEmpty()) {
            return null;
        }

        return tope.getElemento();
    }

    /**
     * Quita la posici�n ubicada en el tope de la pila.
     */
    @Override
    public void pop() {
        this.tope = this.tope.getSiguiente();
    }

    /**
     * Agrega el elemento pasado por par�metro en el tope de la pila.
     *
     * @param x
     */
    @Override
    public void push(T x) {
        if (isEmpty()) {
            this.tope = new NodoLista(x);
        } else {
            NodoLista<T> nuevoNodo = new NodoLista(x);
            nuevoNodo.setSiguiente(tope);
            this.tope = nuevoNodo;
        }
    }

    /**
     * Vac�a la estructura
     */
    @Override
    public final void makeEmpty() {
        this.tope = null;
    }

    @Override
    public String toString() {
        String resultado = "";

        NodoLista<T> nodoActual = tope;
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
