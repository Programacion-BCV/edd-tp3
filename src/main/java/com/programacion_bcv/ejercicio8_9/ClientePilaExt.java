/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programacion_bcv.ejercicio8_9;

/**
 *
 * @author Pc-Ramiro
 */
public class ClientePilaExt {

    public static void main(String[] args) {
        PilaExtImp pila1 = new PilaExtImp();
        pila1.push(6);
        pila1.push(7);
        pila1.push(8);
        pila1.push(9);
        pila1.push(10);
        
        PilaPorEnlaces<Integer> pilaParam = new PilaPorEnlaces();
        pilaParam.push(1);
        pilaParam.push(2);
        pilaParam.push(3);
        pilaParam.push(4);
        pilaParam.push(5);

        System.out.println("Pila por Enlacess (completa): " + pilaParam.toString());
        pila1.invertirOrden();
        System.out.println("Pila por Enlaces (completa): " + PilaExtInterfaz.pilaEstructura.toString());
    }
}
