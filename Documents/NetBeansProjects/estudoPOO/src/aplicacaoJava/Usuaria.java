package aplicacaoJava;

/**
 *
 * @author Deise Kinsk
 */
public class Usuaria {
    protected String nome;
    protected int cpf;
    protected int senha;
    private boolean monoparental;
    
    //metodos
    
      private boolean autentica (int senhaP){
        if (this.senha == senhaP){
        System.out.println("Acesso válido.");
        return true;
        }else{
         System.out.println("Senha inválida. Tente novamente");
         return false;               
        }
      }
           //Get
        public String getNome(){
            return nome;
        } 
        
        public int getCpf(){
            return cpf;
        }

        //Set
        public void setNome(String nomeP){
                this.nome = nomeP;
        }
        
        public void setCpf(int cpfP){
            this.cpf = cpfP;
        }
        
    }