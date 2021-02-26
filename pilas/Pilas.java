/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author edi
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaADT<Integer> pila = new PilaEE();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        
        System.out.println(pila.pop());
        System.out.println(pila.peek());
        System.out.println(pila.isEmpty());
        System.out.println(pila.toString());
    }
    
}
