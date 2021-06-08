
package javaapplication.poo;

/**
 *
 * @author Deise Kinsk
 */
 import java.io.IOException;
public class exception001 {
//use throws clause
  void m() throws IOException{
  throw new IOException("Error!");
  }
  
  void n()throws IOException {
  m();
  }
  
  void p(){
  try{
  n();
  }catch(IOException e){
  System.out.println("Exception handle");
  }
  
  }
//
  public static void main(String Arg[]){  
   exception001 obj=new exception001();  
   obj.p();  
   System.out.println("Normal flow...");  
  } 

}
   
