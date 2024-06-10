public class Pessoa{
    private String nome;
    privare int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}