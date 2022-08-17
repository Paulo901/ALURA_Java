package usapoo;

public class chamandoobj {

	public static void main (String[] args) {
		
	//Criação de conta e implantação de dados 	
	 ContaVip ContaA = new ContaVip(1234, 4321);
	
	 ContaA.deposita(200.0);
	 
	 System.out.println(ContaA.getSaldo());
	 
	 ContaA.saca(20);
	 
	 System.out.println(ContaA.getSaldo());
	 System.out.println("Sua Agência é " + ContaA.getAgencia());
	 
	 Cliente paulo = new Cliente();
	 paulo.setNome("Paulo Rodrigo");
	 paulo.setCpf("202.202.202-20");

	 
	  ContaA.setTitular(paulo);
	 
	 System.out.println(ContaA.getTitular().getNome());
	 System.out.println(ContaA.getTitular());

	 ContaVip ContaB = new ContaVip(5678, 8765);
	 Cliente rodrigo = new Cliente();
	 ContaB.setTitular(rodrigo);
	 ContaB.deposita(100);
	 ContaB.transfere(50, ContaA);
	 ContaB.saca(10);
	 rodrigo.setCpf("123-456-789-01");
	 rodrigo.setNome("Paulo");
	 rodrigo.setProfissao("Programador");
	 ContaB.setSenha(12345432);
	 System.out.println(ContaB.getTitular().getNome());
	 System.out.println(ContaB.getTitular().getCpf());
	 System.out.println(rodrigo.getProfissao());
	 System.out.println(ContaB.getSaldo());
	 
	}
}
