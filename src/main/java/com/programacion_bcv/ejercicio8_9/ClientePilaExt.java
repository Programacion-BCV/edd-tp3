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

        System.out.println(pilaMain);

        pilaAux.push(1);
        pilaAux.push(3);
        pilaAux.push(5);
        pilaAux.push(7);
        pilaAux.push(9);
        pilaAux.push(11);
        pilaAux.push(13);

        pilaAux2.push(100);
        pilaAux2.push(1000);

        System.out.println(pilaAux);

        pilaMain.intercalar(pilaAux);
        System.out.println(pilaMain);

        pilaMain.agregarTodos(pilaAux2);
        System.out.println(pilaMain);


    }
}
