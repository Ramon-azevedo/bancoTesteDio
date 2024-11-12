package bancodio.cliente;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
}
