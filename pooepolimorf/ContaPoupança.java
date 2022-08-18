package pooepolimorf;

//Conectado com Cliente por enquanto para não dar erro
//Erro ao conectar com a classe conta
public class ContaPoupança extends Conta implements ValidaCred{
    
private int senha;

     //Criando Construtor
    	public ContaPoupança(int agencia, int numero ) {
    		  super(agencia, numero);
    }
        
    
        
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
        @Override
	protected double getDescontos() {
             this.deposita(0.003); 
             return 0;
        }
   
        @Override
        public void transfere(double valor,Conta destino) {
            //Contas Vip recebem descontos de até 5% de desconto
            this.deposita(valor * getDescontos());
            return;   
        }



		@Override
		public boolean autentica(int senha) {
			// TODO Auto-generated method stub
			return false;
		}
        
}