public interface Trabalhador{
    void trabalhar();
}

public class Funcionario implements Trabalhador{
    protected double salario;
    protected String departamento;

    public Funcionario(double salario, String departamento){
        this.salario = salario;
        this.departamento = departamento;
    }

    public void exibirinformacoes(){
        System.out.println("Salário: " + salario);
        System.out.println("Departamento: " + departamento);
    }

    public void trabalhar(){
        System.out.println("O funcionário está trabalhando.");
    }
}

public class Gerente extends Funcionario implements Trabalhador{
    private double bonus;

    public Gerente(double salario, String departamento, double bonus){
        super(salario, departamento);
        this.bonus = bonus;
    }

    public void exibir informacoes(){
        super.exibirInformacoes();
        System.out.println("Bonus: " + bonus);
    }

    public void trabalhar(){
        System.out.println("O gerente está trabalhando.");
    }
}