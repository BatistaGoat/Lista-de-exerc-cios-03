public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 0;
    }


}

public class Estudante extends Pessoa{
    private String curso;

    public Estudante(String nome, int idade, String curso){
        super(nome, idade);
        this.curso = curso;
    }

    public Estudante(String nome, String curso){
        super(nome);
        this.curso = curso;
    }


}