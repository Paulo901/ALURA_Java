
package pooepolimorf;

public class Usapoos {

	public static void main (String[] args) {
		
	//Criação de conta e implantação de dados 	
	  
	ContaVip ContaB = new ContaVip(12, 12);
	Cliente rodrigo = new Cliente();
        ContaB.setTitular(rodrigo);
	ContaB.deposita(100);
        
        
        ContaCorrente ContaA = new ContaCorrente(12, 34);
        Cliente paulo = new Cliente();
        ContaA.setTitular(paulo);
	ContaA.deposita(100);
        
        
        //RegistraC controle = new RegistraC();
        //        controle.registra(ContaB);
        //        controle.registra(ContaA);
	ContaB.setSenha(12345432);
	
        ContaA.transfere(100.0, ContaB);
      
	System.out.println("CB " + ContaB.getSaldo());
        System.out.println("CA " + ContaA.getSaldo());
        
        ContaB.transfere(50.0, ContaA);
        
        System.out.println("CB " + ContaB.getSaldo());
        System.out.println("CA " + ContaA.getSaldo());
        
        //System.out.println(controle.getSoma());
         
         ContaB.setSenha(222);
         boolean autenticacao = ContaB.autentica(22);
         System.out.println(autenticacao);
         
         SistemaCred a = new SistemaCred();
                 a.autenticacao(ContaB);
                 /*Esta parte não compila pois o tipo da contaA de fato não pode 
                  * acessar a classe SistemaCred
                  
                 a.autenticacao(ContaA);
                 */

	}
}
