package com.programacion_bcv.ejercicio5_6_7;


public class ListaDoble<T> implements ListaDobleInterfaz<T> {

    protected NodoListaDoble<T> header;
    protected NodoListaDoble<T> inicio;
    protected NodoListaDoble<T> fin;
    private int contador;


    @Override

    public boolean isEmpty() {
        return inicio == null;
    }


    @Override
    public int size() {
        return contador;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void add(T element) {
        if (!isEmpty()) {
            fin = new NodoListaDoble<>(element, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoListaDoble<>(element);
        }
        contador++;
    }

    @Override
    public void remove(T element) {
        if (inicio != null) {
            NodoListaDoble<T> aux = inicio;
            NodoListaDoble<T> anterior = null;
            while (aux != null) {
                if (aux.getElemento() == element) {
                    if (anterior == null) {
                        inicio = inicio.getSiguiente();
                        aux.setSiguiente(null);
                        aux = inicio;

                    } else {
                        anterior.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(null);
                        aux = anterior.getSiguiente();
                    }
                } else {
                    anterior = aux;
                    aux = aux.getSiguiente();
                }
            }
        }
    }

    @Override
    public IteradorListaDobleInterfaz<T> iterador() {
        return new IteradorListaDoble();
    }


    @Override
    public String toString() {
        String cadena = "";
        for (NodoListaDoble<T> aux = inicio; aux != null; aux = aux.siguiente) {
            cadena += aux.elemento.toString() + " ";
        }
        return cadena;
    }
}
