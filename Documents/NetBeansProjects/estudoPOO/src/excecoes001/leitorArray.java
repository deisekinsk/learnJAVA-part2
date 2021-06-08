package excecoes001;

/**
 *
 * @author Deise Kinsk
 */
import java.util.Scanner;
public class leitorArray {
    public static void main(String[] args){
        String nomes[] = new String[3];
        Scanner ler = new Scanner (System.in);
        
        for (int i = 0; i <= 5; i++){
            System.out.println("Digite o nome:");
            nomes[i] = ler.next();
        }
    
    }
    
}
