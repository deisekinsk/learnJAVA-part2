
package arrays_poo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

/**
 *
 * @author Deise Kinsk
 */
public class TesteHashSet {
    
    public static void main(String[] args){
                // coleções | add; remove; int size; contains
                HashSet itens = new HashSet();
                ArrayList nomes = new ArrayList();
                HashMap livros = new HashMap();
                
                //metodo add = retornam verdadeiro (true) ou falso (false) para indicar se a adição foi bem sucedida
                itens.add("Chocolate");
                itens.add("Bala");
                itens.add("Brigadeiro");
                
                nomes.add("Maria");
                nomes.add("João");
                
                //armazena duas informações
                livros.put(1, "Volta ao mundo em 80 dias");
                livros.put(2, "Alice no país das maravilhas");
                livros.put(5, "Caninos Brancos ");

                System.out.println("ITENS: "+itens);
                System.out.println("NOMES: "+nomes);
                System.out.println("LIVROS: "+livros);
	}
    
}
