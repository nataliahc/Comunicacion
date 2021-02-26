/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import estructurasenlazadas.Nodo;

/**
 *
 * @author Natalia Hernández
 */

///// IMPLEMENTACIÓN DE PILAS CON ESTRUCTURAS ENLAZADAS

public class PilaEE <T> implements PilaADT <T>{
    
    private Nodo<T> tope;

    public PilaEE() {
        tope = null;
    }
    
    @Override
    public boolean isEmpty() {
        return tope==null;
    }

    @Override
    public void push(T dato) {
        Nodo<T> nuevo = new Nodo(dato);
        nuevo.setSig(tope);
        tope=nuevo;
    }

    @Override
    public T pop() {
        if(isEmpty())
            throw new EmptyCollectionException();
        T res = tope.getDato();
        tope = tope.getSig();
        return res;
    }

    @Override
    public T peek() {
        if(isEmpty())
            throw new EmptyCollectionException();
        return tope.getDato();
    }
    
    public String toString() {
        return toString(new StringBuilder(), tope);
    }

    private String toString(StringBuilder sb, Nodo<T> nodo) {
        if (nodo == null) {
            return sb.toString();
        } else {
            sb.append(nodo.getDato().toString()).append(" ");
            return toString(sb, nodo.getSig());
        }
    }
    
}
