package com.programacion_bcv.ejercicio8_9;

import ar.edu.uner.fcad.ed.edlineales.NodoLista;

public class PilaExtImp<T> extends PilaPorEnlaces<T> implements PilaExtInterfaz<T> {

    public PilaExtImp() {
        super();
    }

    @Override
    public void intercalar(PilaPorEnlaces<T> pilaParam) {
        PilaExtImp<T> nuevaPila = new PilaExtImp<>();
        NodoLista<T> nodo=new NodoLista<>(null);
        while (!(this.isEmpty()) || !(pilaParam.isEmpty())) {

            if (!(this.isEmpty())) {
                nuevaPila.push(this.top());
                this.pop();
            }
            if (!(pilaParam.isEmpty())) {
                nuevaPila.push(pilaParam.top());
                pilaParam.pop();
            }
        }
        this.tope = nuevaPila.tope;
    }

    @Override
    public void agregarTodos(PilaPorEnlaces<T> pilaParam) {

        while (!(pilaParam.isEmpty())) {
            this.push(pilaParam.top());
            pilaParam.pop();

        }
    }

    @Override
    public void invertirOrden() {
        PilaExtImp<T> nuevaPila = new PilaExtImp<>();

        // while (this.isEmpty())

    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder("");

        if (isEmpty()) {
            return "Cola vacia";
        } else {
            NodoPila<T> nodo = this.tope;

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
