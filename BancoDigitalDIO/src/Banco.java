import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private static List<Conta> Contas = new ArrayList<Conta>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return Contas;
	}

	public void addConta(Conta conta) {
		Contas.add(conta);
	}
}
