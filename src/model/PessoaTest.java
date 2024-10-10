package model;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;

/**
 * Author: Lucas Jardim
 */
public class PessoaTest {
    @Test
    public void contemFeminino() {
        List<Pessoa> listPessoas = Pessoa.listPessoa();

        List<Pessoa> containFeminino = listPessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Feminino"))
                .toList();
        assertFalse("Não possui nenhuma Pessoa com genero Feminino.", containFeminino.isEmpty());

        System.out.println("Existe no total " + containFeminino.size() + " pessoas com genero feminino!");
    }
}
