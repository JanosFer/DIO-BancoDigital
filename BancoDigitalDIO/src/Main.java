
public class Main {

	public static void main(String[] aegs) {
		Banco b1 = new Banco();
		
		Cliente c1 = new Cliente();
		c1.setNome("cliente01");
		c1.setCpf("111.222.333-44");
		
		Cliente c2 = new Cliente();
		c2.setNome("cliente02");
		c2.setCpf("222.333.444-55");
		
		Conta c1Corrente = new ContaCorrente(c1);
		Conta c1Poupanca = new ContaPoupanca(c1);
		Conta c2Corrente = new ContaCorrente(c2);
		Conta c2Poupanca = new ContaPoupanca(c2);
		
		b1.setNome("Bradesco");
		b1.addConta(c1Corrente);
		b1.addConta(c1Poupanca);
		b1.addConta(c2Corrente);
		b1.addConta(c2Poupanca);
		
		c1Corrente.depositar(5430.00);
		c1Corrente.transferir(543.00, c1Poupanca);
		c2Poupanca.depositar(1000.00);
		c2Poupanca.transferir(330.00, c1Corrente);
		
		for(Conta conta : b1.getContas()) {
			conta.imprimirExtrato();
		}
	}
}
