/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionario;

/**
 *
 * @author Deise Kinsk
 */
public class Teste {
    public static void main(String[] args) {
Funcionario fn = new Funcionario();
fn.setSalario(1300);
System.out.println(fn.getSalario());
fn.aumentaSalario();
System.out.println(fn.getSalario());
//fn.salario = 1333;
fn.setSalario(1333);
System.out.println(fn.getSalario());
fn.aumentaSalario();
System.out.println(fn.getSalario());
}
}
