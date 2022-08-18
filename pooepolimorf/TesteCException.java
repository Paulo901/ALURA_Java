package pooepolimorf;

// Exceções: parte5 - Implementei minha pŕopria exceção em Conta

public class TesteCException {

	public static void main (String [] args) {
	ContaCorrente A = new ContaCorrente(123, 321);
	A.deposita(200);	
	ContaCorrente B = new ContaCorrente(123, 321);

	
	try {
		A.transfere(220, B);
	}catch(Exception e) {
	
		System.out.println(e.getMessage());
		
	}
	System.out.println(A.getSaldo());

	}
}
