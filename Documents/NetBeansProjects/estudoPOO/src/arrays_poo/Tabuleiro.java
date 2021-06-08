package arrays_poo;

/**
 *
 * @author Deise Kinsk
 */
public class Tabuleiro {
    
    public static void main (String[] args){
        
        String [][] tabuleiro = new String[8][8];
        
        tabuleiro[0][0] = "Torre Branca";
        tabuleiro[0][1] = "Torre Branca";
        tabuleiro[1][0] = "Torre Branca";
        tabuleiro[0][3] = "Torre Branca";
        
        System.out.println(tabuleiro[0][1]);
    
    }
    
}
