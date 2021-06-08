package Transporte;

/**
 *
 * @author Deise Kinsk
 */
//subclasse de terrestre
//Para criar a aherança extends, colocar o nome da superclasse 
//Classe object é a classe raiz de todas as classes Java. Mesmo que omita o termo 'extends'.
//Operador SUPER: chama o construtctor da superclasse, para inicializar antes da classe filha.
public class Automovel extends Terrestre {

    
    private String cor;
    private int numPortas;
    private String placa;
    
    public Automovel(){
        super(5,4);
    }
    
    public Automovel (int capacidadeP, int numRodasP, String corP, int numPortasP, String placaP){
    super(capacidadeP, numRodasP);
    this.cor = corP;
    this.numPortas = numPortasP;
    this.placa = placaP;
    }
    //Get
    public String getCor(){
            return cor;
    }
     public String getPlaca(){
            return placa;
    }
     
    public int getNumPortas(){
        return numPortas;
    } 
    
    //Set
    public void setCor(String corP){
            this.cor = corP;
    }

    public void setNumPortas(int numPortasP){
            this.numPortas = numPortasP;
    }

    public void setPlaca(String placaP){
            this.placa = placaP;
    }
   
  
    
    public void imprimiDados(){
        //Sem o uso de protected, não é possível buscar os atributos da outras classes
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Numedo de rodas: "+ numRodas);
        System.out.println("Cor: " + cor);
    }
    
     public static void main(String[] args){
    Automovel automovel01 = new Automovel();
    
    
    }
}
