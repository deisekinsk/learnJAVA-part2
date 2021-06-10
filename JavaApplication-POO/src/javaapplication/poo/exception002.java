package javaapplication.poo;

/**
 *
 * @author Deise Kinsk
 */
public class exception002 {
    public static void main (String args[]){
        String test = "no";
        
        try{
        System.out.println("Start TRY.");
        runTheException(test);
        System.out.println("End TRY.");
        
        }catch(personalException ex){
        System.out.println("Run CATCH");
        
        }finally{
        System.out.println("Run FINALLY");
        }
        
       System.out.println("End of MAIN");
    }
    
    static void runTheException(String test) throws personalException{
    
    System.out.println("START the personal exception. ");
        if("yes".equals(test)){
            throw new personalException();
        }
        System.out.println("END the personal exception.");
        return;
        
            
    }
}
