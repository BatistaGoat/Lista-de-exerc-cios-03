public class Funcionario{
    protected double salario;
    protectedd String departamento;

    public Funcionario(double salario, String departamento){
        this.salario = salario;
        this.departamento = departamento;
    }

    public void exibirInformacoes(){
        Syestem.out.println("Salário: " + salario);
        System.out.println("Departamento: " + departamento);
    }
}

public class Gerente extends Funcionario{
    private double bonus;


public Gerente(double salario, String deoartamento, double bonus){
    super(salario, departamento);
    this.bonus = bonus;
}

public void exibirInformacoes(){
    super.exibirinformacoes();
    System.out.println("Bonus: " + bonus);
}
}