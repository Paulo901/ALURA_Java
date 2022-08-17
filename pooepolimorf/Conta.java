package usapoo;
public abstract class Conta {

	// ATributos
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private double Descontos;
    private static int totalC;

    
    protected abstract double getDescontos();
    
    //Criando Construtor
    	public Conta(int agencia, int numero ) {
    		if(agencia <=0 || numero <=0) {
    			System.out.println("Agência ou número invalidos. A agencia será padronizada");
                        this.agencia = 1;
    			this.numero = 1;    
                      
    		}   else {
    				
                        this.agencia = agencia;
    			this.numero = numero;
    			System.out.println("Sua conta foi criada");
    			Conta.totalC++;
			System.out.println("O total de Contas é" + getTotalC());

    		}
        
    }
    
    // Criando Métodos
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if(saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor,Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor - (valor * getDescontos());          
            destino.deposita(valor);
                   
            return true;
        }
        return false;
    }
    // Métodos Getters e Setters
    public  double getSaldo(){
        return saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }
    
    public static int getTotalC() {
    	return Conta.totalC;
    	
    }
    
    

}
