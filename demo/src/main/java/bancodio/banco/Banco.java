package bancodio.banco;

import java.util.List;

import bancodio.conta.Conta;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Banco {
    private String nome;
    private List<Conta> contas;
}
