package usapoo;

//Conectado com Cliente por enquanto para não dar erro
//Erro ao conectar com a classe conta
public class ContaCorrente extends Conta {
    
private int senha;

     //Criando Construtor
    	public ContaCorrente(int agencia, int numero ) {
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
       
       return 0.02;
        }
   
        
        
}