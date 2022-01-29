
public class Main {

	public static void main(String[] args) {
		 
	    Cliente pedro = new Cliente();
	    pedro.setNome("Pedro Januario");
		
		Conta cc = new ContaCorrente(pedro);
		Conta cp = new ContaCorrente(pedro);
		
		cc.depositar(100);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
