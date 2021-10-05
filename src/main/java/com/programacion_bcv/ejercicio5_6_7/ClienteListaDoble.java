package com.programacion_bcv.ejercicio5_6_7;

public class ClienteListaDoble {
    public static void main(String[] args) {
        try {
            ListaDoble<Integer> lista = new ListaDoble<Integer>();
            lista.add(5);
            lista.add(4);
            lista.add(3);
            lista.add(2);
            lista.add(1);
            lista.add(6);

            System.out.println("Lista:" + lista);
            System.out.println("¿La lista esta vacía? "+ lista.isEmpty());
            System.out.println("Tamanio de la lista: " + lista.size());
            System.out.println("Removiendo el número 6");
            lista.remove(6);
            System.out.println("Lista sin el número 6: " + lista);
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
    }
}
