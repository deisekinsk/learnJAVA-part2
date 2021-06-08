package arrays_poo;

/**
 *
 * @author Deise Kinsk
 */
public class TreinadorMain {
    public static void main(String[] args){
        String nomeAtleta = "Bolt";
        //a palavra new é usada com o objetivo de indicar quantos valores  serão necessários para                           armazenar tais valores.
        double[] marca = new double[5];
        
        //1°
        marca[0]= 10.02;
        marca[1]= 10.0;
        marca[2]= 9.56;
        marca[3]= 9.57;
        marca[4]= 9.56;
        
        //2°
        double[] marca2 = {10.2, 10.0, 9.56,9.57,9.56};
        
            
        //impressão
        System.out.println(marca[0]);
        System.out.println(marca2[1]);
        
        //3°
        System.out.println("Usando o for:");
        for(int i =0; i<5;i++){
                System.out.println(marca[i]);
        }
        System.out.println("Usando LENGTH");
        for(int i = 0;i<marca.length;i++){
	System.out.println("Marca"+(i+1)+": " +marca[i]);
}
    }
    
}
