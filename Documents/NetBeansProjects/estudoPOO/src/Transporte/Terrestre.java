package Transporte;

/**
 *
 * @author Deise Kinsk
 */
//subclasse de transporte
  //PROTECTED: apenas classes que pertencem à hierarquia de herança podem acessar diretamente esses atributos
public class Terrestre extends Transporte {
          
    protected int numRodas;
    
    public Terrestre(int capacidadeP, int numRodasP){
        super(capacidadeP);
        this.numRodas = numRodasP;
    }
    
    public int getNumRodas(){
     return numRodas;
    }
    
    public void setNumRodas(int numRodasP){
        this.numRodas = numRodasP;
    }
    
}
