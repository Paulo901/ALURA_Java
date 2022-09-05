package entendendojavautils;

import pooepolimorfismo.Conta;

public class GuardadorDeContas {
	
	//Apenas criando um array numa classe para ser chamada e eu poder usar o array mais facilmente
	
		private Object[] referencias;
	    private int posicaoLivre;
	   

	    public GuardadorDeContas() {
	        this.referencias = new Object[10];
	     
	    }

	    public void adiciona(Object ref) {
	        referencias[this.posicaoLivre] = ref;
	        this.posicaoLivre++;
	    }

	    public int getCasasOcupadas() {
	        return this.posicaoLivre;
	    }
	    public Object getReferencia(int pos) {
	        return this.referencias[pos];
	    }
}
