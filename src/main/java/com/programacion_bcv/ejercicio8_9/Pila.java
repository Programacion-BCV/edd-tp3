
package com.programacion_bcv.ejercicio8_9;


public interface Pila<T> {
    /**
     * Indica si la estructura est� vac�a
     * @return 
     */
    public boolean isEmpty();

    /**
     * Indica si la estructura est� llena
     * @return 
     */
    public boolean isFull();

    /**
     * Retorna el elemento ubicado en la posici�n tope de la pila.
     * @return 
     */
    public T top();

    /**
     * Quita la posici�n ubicada en el tope de la pila.
     */
    public void pop();

    /**
     * Agrega el elemento pasado por par�metro en el tope de la pila.
     * @param elemento 
     */
    public void push(T elemento);

    /**
     * Vac�a la estructura
     */
    public void makeEmpty();
    
    /**
     * Concatena todos el resultado de aplicar toString() a cada uno de los elementos
     * de la pila.
     * @return 
     */
    @Override
    public String toString();
}
