class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
    }
}

class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Curso: " + curso);
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];

        pessoas[0] = new Pessoa("João");
        pessoas[1] = new Estudante("Maria", "Engenharia");
        pessoas[2] = new Estudante("Pedro", "Medicina");

        for (Pessoa pessoa : pessoas) {
            pessoa.exibirInformacoes();
            System.out.println();
        }
    }
}
