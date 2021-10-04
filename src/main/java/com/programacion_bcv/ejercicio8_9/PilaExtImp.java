package com.programacion_bcv.ejercicio8_9;

import ar.edu.uner.fcad.ed.edlineales.NodoLista;
import ar.edu.uner.fcad.ed.edlineales.pilas.PilaPorEnlaces;

public class PilaExtImp<T> extends PilaPorEnlaces<T> implements PilaExtInterfaz<T> {

    public PilaExtImp() {
        super();
    }

    @Override
    public void intercalar(PilaPorEnlaces<T> pilaParam) {
        PilaExtImp<T> nuevaPila = new PilaExtImp<>();
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

        while (!(this.isEmpty())){
            nuevaPila.push(this.top());
            this.pop();
        }
        this.tope=nuevaPila.tope;
    }

    @Override
    public String toString() {
        String retorno = "";

        if (isEmpty()) {
            return "Cola vacia";
        } else {
            NodoLista<T> nodo = this.tope;

            while (nodo != null) {

                retorno+=nodo;

                nodo = nodo.getSiguiente();
                if (nodo != null) {
                    retorno+=",";
                }
            }
            return retorno;
        }
    }
}
