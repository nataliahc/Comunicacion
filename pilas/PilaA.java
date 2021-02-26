/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

//import conjuntos.IteradorArreglo;
//import java.util.Iterator;

/**
 *
 * 
 */
public class PilaA <T> implements PilaADT <T> {
    private T[] pila;
    private int tope;
    private final int MAX=20;
    
    public PilaA() {
        pila=(T[]) new Object[MAX];
        tope=-1;
    }
    
    public PilaA(int max) {
        pila=(T[]) new Object[max];
        tope=-1;
    }
    
    public boolean isEmpty() {
        return tope==-1;
    }
    
    public void push(T dato) {
        if(tope== pila.length-1)
            expande();
        tope++;
        pila[tope]=dato;
    }
    
    private void expande() {
        T[] nuevo=(T[]) new Object[pila.length*2];
        for(int i=0;i<=tope;i++)
            nuevo[i]=pila[i];
        pila=nuevo;
    }
    
    public T pop() {
        if(isEmpty())
            throw new EmptyCollectionException();
        T res;
        res=pila[tope];
        pila[tope]=null;
        tope--;
        return res;
    }
    
    public T peek() {
        if(isEmpty())
            throw new EmptyCollectionException();
        return pila[tope];
    }
    
//    public Iterator<T> iterator() {
//        return new IteradorArreglo(pila, tope+1);
//    }
    
    // método toString
    public String toString() {
        StringBuilder res = new StringBuilder();
        
        for(int i=0; i<=tope; i++) {
            res.append(pila[i]).append(" ");
        }
        return res.toString();
    }
}