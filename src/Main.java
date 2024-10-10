import model.Pessoa;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: Lucas Jardim
 */
public class Main {
    public static void main(String[] args) {
        List<Pessoa> listPessoas = Pessoa.listPessoa();

        System.out.println("Masculinos: ");
        List<Pessoa> listMasculino = listPessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Masculino"))
                .collect(Collectors.toList());

        listMasculino.forEach(System.out::println);

        System.out.println("---------------------");

        System.out.println("Femininos: ");
        listPessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Feminino"))
                .forEach(System.out::println);
    }
}
