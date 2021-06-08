/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismoexe01;

/**
 *
 * @author Deise Kinsk
 */
public class B {
         public void meuMetodo(E e){

          System.out.print("B ");

          C c = new C();

          e.meuMetodo(c);}
}
