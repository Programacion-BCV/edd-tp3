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
            System.out.println(lista.size());
            lista.remove(6);
            System.out.println("Lista:" + lista);
            lista.get(3);
            int i = 0;
            IteradorListaDoble<Integer> iterador = new IteradorListaDoble<>();
            while (iterador.existeSiguiente()) {
                System.out.println("Posición " + i++ + ": " + iterador.siguiente());
            }
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
    }
}
