
package excecoes001;

/**
 *
 * @author Deise Kinsk
 */

public class TestarReator {
    public static Reator ligarReator() throws ReatorException{

}
    
    public void TesteLigar(){
        try{
            Reator reator = new Reator();
            reator.ligarReator();
        }catch (ReatorException ex){
            System.out.println("OFF");
        }
    
    }

    private static class Reator {

        public Reator() {
        }
    }

    private static class ReatorException extends Exception {

        public ReatorException() {
        }
    }
}
