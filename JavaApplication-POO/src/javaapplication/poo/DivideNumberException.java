
package javaapplication.poo;
/**
 *
 * @author Deise Kinsk
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideNumberException {
    //throws - ArithmeticException
    public static int calculate (int numA, int numB)
            throws ArithmeticException{
                return numA/numB;
    }
    
    public static void main (String[] args){
        
        //More enter data
        Scanner readNumber = new Scanner(System.in);
        boolean loopAgain = true;
        
        do{
            try{
                //insert numbers
                System.out.println("Insert the first integer number: ");
                int numA = readNumber.nextInt();
                System.out.println("Insert the second integer number: ");
                int numB = readNumber.nextInt();

                //result
                double result = calculate(numA,numB);
                System.out.println("The result of "+ numA +" divided for "+numB+ " is " +result + ".");
                loopAgain = false; // end if its number are integer.
               

                }catch (ArithmeticException erro){
                    System.err.println(erro);
                    System.out.println("Invalid input. Zero is an invalid denominator.");
                    
                }catch(InputMismatchException erro2){
                    System.err.println(erro2);
                    readNumber.nextLine(); //Input again
                    System.out.println("Invalid input. Insert the integer.");            
              
                }
                finally{
                    System.out.println("Erro! Impossible recognize.");
                }
        
        }while (loopAgain);
    System.out.println("End.");    
    }
    
    
    
}
