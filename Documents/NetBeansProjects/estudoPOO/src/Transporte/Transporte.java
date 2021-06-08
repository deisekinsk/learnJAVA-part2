
package Transporte;

/**
 *
 * @author Deise Kinsk
 */

//PROTECTED: apenas classes que pertencem à hierarquia de herança podem acessar diretamente esses atributos
//Operador SUPER: chama o construtctor da superclasse, para inicializar antes da classe filha.
public class Transporte {
        protected int capacidade;

        
        public Transporte(int capacidadeP){
        super();
        this.capacidade = capacidadeP;
        }
        public int getCapacidade(){
            return capacidade;
        }
        
        public void setCapacidade (int capacidadeP){
            this.capacidade = capacidadeP;
        }
}
