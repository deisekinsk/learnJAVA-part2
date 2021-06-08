
package aplicacaoJava;

/**
 *
 * @author Deise Kinsk
 */
public class Administradora extends Usuaria {
    protected boolean mediadora;
    
        
        //Get
        public boolean getMediadora(){
                  return mediadora;
              }

        //Set
        public void setMediadora(boolean mediadoraP){
                this.mediadora = mediadoraP;
        }
    
}
