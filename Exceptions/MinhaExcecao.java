package Exceptions;

//Exceções: parte3 - Criando sua própria exceção
//			parte4 - Conectei diretamente ao Exception para cair na situação do Checked
//				   - Com o Runtime cai no Unchecked
public class MinhaExcecao extends Exception{ //Checked

	public MinhaExcecao(String msm) {
		super(msm);

	}
}
/*
public class MinhaExcecao extends RuntimeException{ //Unchecked

	public MinhaExcecao(String msm) {
		super(msm);

	}
}
*/