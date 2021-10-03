package com.programacion_bcv.ejercicio5;

public interface IteradorListaDobleInterfaz<T> {
    boolean isEmpty();

    int size();

    Object get(int index);

    void add(Object element);

    void remove(Object element);

    IteradorListaDobleInterfaz<T> iterador();

    /**
     * Indica si existe un nodo a continuación del actual.
     */
    public boolean existeSiguiente();

    /**
     * Sigue el enlace al nodo siguiente y devuelve el elemento del mismo.
     */
    public T siguiente();

    /**
     * Se mueve al nodo primer nodo y devuelve su valor.
     */
    public T primero();

    /**
     * Indica si existe un nodo a previo al actual.
     */
    public boolean existeAnterior();

    /**
     * Sigue el enlace al nodo anterior y devuelve el elemento del mismo.
     */
    public T anterior();

    /**
     * Se mueve al nodo último nodo y devuelve su valor.
     */
    public T ultimo();


}
