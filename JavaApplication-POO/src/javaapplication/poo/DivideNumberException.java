
package javaapplication.poo;
/**
 *
 * @author Deise Kinsk
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideNumberException {
    public static int calculate (int numA, int numB) throws ArithmeticException{
        return numA/numB;
    }
    public static void main (String[] args){
        try{
            //insert numbers
            Scanner read = new Scanner(System.in);
            System.out.println("Insert the first number: ");
            int numA = read.nextInt();
            System.out.println("Insert the second number: ");
            int numB = read.nextInt();
            
            //result
            double result = calculate(numA,numB);
            System.out.println("The result of "+ numA +" divided for "+numB+ " is " +result + ".");
        
        }
        catch (ArithmeticException erro){
            System.out.println(erro);
            System.out.println("Number invalid.");
        }
    }
    
}
