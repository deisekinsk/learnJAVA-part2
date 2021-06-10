package javaAppStatic;

/**
 *
 * @author Deise Kinsk
 */
public class clockWorkMain {
     //MAIN
      public static void main (String[] args){
          //objects
          clockWork locationAmerica = new clockWork(1,"America");
          clockWork locationEurope = new clockWork(2,"Europe");
          clockWork locationAsia = new clockWork(3,"Asia");
          
          //this is example the use a static attribute.
          clockWork.hour = (7);
          clockWork.minute = (45);
          clockWork.seconds = (30);
          
          //print simple convertion | need create conditions
          System.out.println("America: " +locationAmerica.hour +":"+ locationAmerica.minute+":"+ locationAmerica.seconds+"s");
          
          System.out.println("Europe: " + (locationEurope.hour+4) +":"+ locationEurope.minute+":"+ locationEurope.seconds+"s");
          
          System.out.println("Asia: " +(locationAsia.hour+12) +":"+ locationAsia.minute+":"+ locationAsia.seconds+"s");
        
        }
        
    
}
