package pooepolimorfismo;

//Conectado com Cliente por enquanto para não dar erro
//Erro ao conectar com a classe conta
public class ContaVip extends Conta implements ValidaCred {
    
private int senha;

     //Criando Construtor
    	public ContaVip(int agencia, int numero ) {
    		  super(agencia, numero);
    }
        
  
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
        @Override
	protected double getDescontos() {
          
       return 0.05;
        }



		@Override
		public boolean autentica(int senha) {
			if(this.senha == senha) {
				return true;
			}
			return false;
		}
		@Override
	    public String toString() {
	    	return "Numero: " + super.getNumero() + ", Agencia: " + super.getAgencia();
	    	
	    }
      
        
}