/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

//import java.util.Iterator;

/**
 *
 * 
 */
public interface PilaADT <T> /*extends Iterable<T>*/ {
    public void push(T dato);
    public T pop();
    public T peek();
    public boolean isEmpty();
    
    
    
//    public Iterator<T> iterator();

    public String toString();
    
}
