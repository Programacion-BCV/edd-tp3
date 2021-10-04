package com.programacion_bcv.ejercicio10_11;

public class ClienteColaAleatoria {
    public static void main(String[] args) {

        ColaAleatoria<Integer> cola = new ColaAleatoria<>();
        cola.enqueue(1);
        cola.enqueue(4);
        cola.enqueue(9);
        cola.enqueue(16);
        cola.enqueue(25);
        cola.enqueue(36);

        System.out.println("***************> Cola <***************");
        System.out.println(cola);
        System.out.println("****************************************");
        System.out.println("***************> La cola esta vacia? <***************");
        System.out.println("La cola " + (cola.isEmpty() ? "esta vacia" : "no esta vacia"));
        System.out.println("****************************************");
        System.out.println("***************> La cola esta llena? <***************");
        System.out.println("La cola " + (cola.isFull() ? "esta llena" : "no esta llena"));
        System.out.println("****************************************");
        System.out.println("***************> Elemento T random de la Cola <***************");
        System.out.println(cola.random());
        System.out.println("****************************************");
        System.out.println("***************> Remover elemento T random de la Cola <***************");
        cola.removeRandom();
        System.out.println(cola);
        System.out.println("****************************************");
        System.out.println("***************> Agregar un elemento T al final de la Cola <***************");
        cola.enqueue(49);
        System.out.println(cola);
        System.out.println("****************************************");
        System.out.println("***************> Vaciar Cola <***************");
        cola.makeEmpty();
        System.out.println(cola);
        System.out.println("****************************************");
    }
}
