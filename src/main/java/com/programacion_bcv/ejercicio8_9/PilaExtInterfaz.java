
package com.programacion_bcv.ejercicio8_9;


    public interface PilaExtInterfaz<T> {
PilaPorEnlaces<Integer> pilaEstructura = new PilaPorEnlaces();
        /**
         * Mezcla los elementos la estructura con los de pilaParam.
         */
        public void intercalar(PilaPorEnlaces<T> pilaParam);

        /**
         * Agrega al final de la estructura los elementos de pilaPam
         */
        public void agregarTodos(PilaPorEnlaces<T> pilaParam);

        /**
         * Invierte el orden de los elementos de la estructura.
         */
        public String invertirOrden();
    }
