package bancodio;

import bancodio.cliente.Cliente;
import bancodio.conta.Conta;
import bancodio.conta.ContaCorrente;
import bancodio.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Conta contaC = new ContaCorrente();
        Conta contaP = new ContaPoupanca();

        contaC.adicionarCliente(new Cliente("Ramon"));
        contaC.adicionarCliente(new Cliente("Kleber"));

        contaP.adicionarCliente(new Cliente("Ronaldo"));
        contaP.adicionarCliente(new Cliente("Messi"));

        
        
        System.out.println(contaC.obterClientes());
        System.out.println(contaP.obterClientes());


    }
}