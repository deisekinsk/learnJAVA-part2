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
public class A {
         public void meuMetodo(B b){

          System.out.print("A ");

          E e = new E();

          b.meuMetodo(e);}
}
