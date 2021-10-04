package com.programacion_bcv.ejercicio5_6_7;

public class NodoListaDoble<T> {
    protected T elemento;
    protected NodoListaDoble<T> siguiente;
    protected NodoListaDoble<T> anterior;

    public NodoListaDoble(T element) {
        this(element, null, null);
    }

    public NodoListaDoble(T elemento, NodoListaDoble<T> siguiente, NodoListaDoble<T> anterior) {
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

    public NodoListaDoble<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaDoble<T> anterior) {
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
