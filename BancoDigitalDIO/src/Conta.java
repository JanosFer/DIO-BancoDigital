
public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	private double saldo;
	private int numero;
	private int numAgencia;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.numAgencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	
	@Override
	public void transferir(double valor, IConta conta) {
		saldo -= valor;
		conta.depositar(valor);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.printf("Titular: %s \n", this.cliente.getNome());
		System.out.printf("CPF: %s \n", this.cliente.getCpf());
		System.out.printf("Agencia: %d \n", this.numAgencia);
		System.out.printf("Numero: %d \n", this.numero);
		System.out.printf("Saldo: %.2f \n", this.saldo);
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumAgencia() {
		return numAgencia;
	}
	
	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
