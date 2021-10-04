package com.programacion_bcv.ejercicio8_9;

public class ClientePilaExt {
    public static void main(String[] args) {
        PilaExtImp<Integer> pilaMain = new PilaExtImp<>();
        PilaExtImp<Integer> pilaAux = new PilaExtImp<>();
        PilaExtImp<Integer> pilaAux2 = new PilaExtImp<>();

        pilaMain.push(2);
        pilaMain.push(4);
        pilaMain.push(6);
        pilaMain.push(8);
        pilaMain.push(10);
        pilaMain.push(12);
        pilaMain.push(14);

        pilaAux.push(1);
        pilaAux.push(3);
        pilaAux.push(5);
        pilaAux.push(7);
        pilaAux.push(9);
        pilaAux.push(11);
        pilaAux.push(13);

        pilaAux2.push(100);
        pilaAux2.push(1000);

        System.out.println("***************> Pila <***************");
        System.out.println(pilaMain);
        System.out.println("****************************************");
        System.out.println("***************> Intercalar Pilas <***************");
        pilaMain.intercalar(pilaAux);
        System.out.println(pilaMain);
        System.out.println("****************************************");
        System.out.println("***************> Agregar un elementos de una pila a otra <***************");
        pilaMain.agregarTodos(pilaAux2);
        System.out.println(pilaMain);
        System.out.println("****************************************");
        System.out.println("***************> Invertir elementos de la pila <***************");
        pilaMain.invertirOrden();
        System.out.println(pilaMain);
        System.out.println("****************************************");
    }
}
