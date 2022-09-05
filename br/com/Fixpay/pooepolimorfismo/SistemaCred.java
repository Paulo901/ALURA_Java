package pooepolimorfismo;

public class SistemaCred  {
	
	private int senha = 222;
	private boolean autentica;
	
	public boolean autenticacao(ValidaCred vc) {
		
		if(autentica == vc.autentica(senha)) {
			System.out.println("Deu certo");
			return true;
		} else {
			System.out.println("não deu");
			return false;
		}
		
	}

}