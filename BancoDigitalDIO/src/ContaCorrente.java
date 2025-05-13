
public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("_________________________________________________\n");
		System.out.println("             Extrato Conta Corrente              ");
		System.out.println("_________________________________________________\n");
		
		super.imprimirExtrato();
	}
}
