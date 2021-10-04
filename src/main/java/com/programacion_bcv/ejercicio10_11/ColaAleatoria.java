package com.programacion_bcv.ejercicio10_11;

public class ColaAleatoria<T> implements ColaAleatoriaInterfaz<T> {
    protected NodoCola<T> front;
    protected NodoCola<T> back;
    protected int capacidad;

    public ColaAleatoria() {
        this.makeEmpty();
    }

    @Override
    public boolean isEmpty() {
        return (this.front == null);
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public T random() {
        NodoCola<T> puntero;

        int contador = 0;
        int numRandom = this.genRandom();

        if (!isEmpty()) {
            puntero = this.front;
            if (numRandom != 0) {
                do {
                    puntero = puntero.getSiguiente();
                    contador++;
                } while (contador != numRandom);
            }
            return puntero.getElemento();

        } else {
            return null;
        }
    }

    @Override
    public void removeRandom() {
        NodoCola<T> puntero;
        NodoCola<T> punteroPrevio;
        int numRandom = this.genRandom();
        int contador = 0;
        if (!isEmpty()) {
            if (numRandom == 0) {
                this.front = (this.capacidad == 0 ? this.back = null : front.getSiguiente());
            } else {
                puntero = this.front;
                do {
                    punteroPrevio = puntero;
                    puntero = puntero.getSiguiente();
                    contador++;
                } while (contador != numRandom);
                puntero = puntero.getSiguiente();
                punteroPrevio.setSiguiente(puntero);

            }
            this.capacidad--;
        }
    }

    @Override
    public void enqueue(T elemento) {
        NodoCola<T> nuevoNodo = new NodoCola<>(elemento);

        if (isEmpty()) {
            this.front = nuevoNodo;
            this.back = nuevoNodo;
        } else {
            this.back.setSiguiente(nuevoNodo);
            this.back = back.getSiguiente();
        }
        capacidad++;
    }

    @Override
    public void makeEmpty() {
        this.front = null;
        this.back = null;
        this.capacidad = -1;
    }

    public int genRandom() {
        return (int) (Math.random() * (this.capacidad + 1));
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder("");

        if (isEmpty()) {
            return "Cola vacia";
        } else {
            NodoCola<T> nodo = this.front;

            while (nodo != null) {
                retorno.append("[");
                retorno.append(nodo);
                retorno.append("]");
                nodo = nodo.getSiguiente();
                if (nodo != null) {
                    retorno.append(",");
                }
            }
            return retorno.toString();
        }
    }
}
