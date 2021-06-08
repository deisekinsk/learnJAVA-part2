/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_poo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deise Kinsk
 */
public class forBasico {
    
    public static void main (String[] args){
        
        List<String> myList = new ArrayList<String>(); // Agora informamos o tipo
        
        myList.add("João"); // neste ponto está OK, adicionamos uma String.
        myList.add(new Dog());
        
        for (String s : myList) {
        int x = s.length();
        // note que não é necessário utilizar um Cast antes de chamar o método da string "s"!
        // O compilador já sabe que "s" é uma String recuperada da coleção myList.
}
        
        
        
    //List <int> b = new ArrayList <int> ();
    int[ ] a = {1,2,3,4};
    
    //versão1
    //valor inicial | valor final | como altera o valor
    for (int x = 0 ; x <a.length ; x++) 
                 System.out.print(a[x]);
    
    //versao2
    // declaração: tipo | expressão: array
    for (int n : a) 
                 System.out.println(n);
    
    //System.out.println(b);
    }
    
}
