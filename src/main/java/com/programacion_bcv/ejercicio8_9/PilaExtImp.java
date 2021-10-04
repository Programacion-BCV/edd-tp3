/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion_bcv.ejercicio8_9;

import ar.edu.uner.fcad.ed.edlineales.NodoLista;

/**
 *
 * @author Pc-Ramiro
 */
public class PilaExtImp extends PilaPorEnlaces implements  PilaExtInterfaz {
    PilaPorEnlaces<Integer> aux = new PilaPorEnlaces();
    @Override
    public void intercalar(PilaPorEnlaces pilaParam) {
    }

    @Override
    public void agregarTodos(PilaPorEnlaces pilaParam) {
       while(!pilaParam.isEmpty()){
                 
       }
    }

    @Override
    public String invertirOrden() {
   NodoLista temporal = tope;
   PilaPorEnlaces  cc = new PilaPorEnlaces();
   while (!isEmpty()){
       cc.push(tope.getElemento());
       tope.getSiguiente();
   }
   tope = temporal;
   return cc.toString();
    }
    
}
