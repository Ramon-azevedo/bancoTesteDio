package bancodio.conta;

import java.util.ArrayList;
import java.util.List;

import bancodio.cliente.Cliente;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected List<Cliente> clientesList;

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.clientesList = new ArrayList<>();
	}

	public List<Cliente> obterClientes() {
		return clientesList;
	}
	

	public void adicionarCliente(Cliente cliente) {
		this.cliente = cliente;
		clientesList.add(cliente);
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
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}


	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

    @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirExtrato'");
    }
}
