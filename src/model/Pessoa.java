package model;

import java.util.List;
import java.util.Objects;

/**
 * Author: Lucas Jardim
 */
public class Pessoa {
    private String nome;
    private String genero;
    private Integer idade;

    public Pessoa(String nome, String genero, Integer idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public static List<Pessoa> listPessoa() {
        Pessoa pessoa1 = new Pessoa("Lucas", "Masculino", 29);
        Pessoa pessoa2 = new Pessoa("Andreia", "Feminino", 29);
        Pessoa pessoa3 = new Pessoa("Pedro", "Masculino", 29);
        Pessoa pessoa4 = new Pessoa("Camila", "Feminino", 29);
        Pessoa pessoa5 = new Pessoa("Carlos", "Masculino", 29);
        Pessoa pessoa6 = new Pessoa("Eliana", "Feminino", 29);

        return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(genero, pessoa.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", idade=" + idade +
                '}';
    }
}
