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
public class Funcionario {
    
    
private double salario;
public double getSalario() {
     return this.salario;
}
public void aumentaSalario(){
     salario = salario*1.1;
}
public void setSalario(double salario) {
     this.salario = salario;
}
    
}
