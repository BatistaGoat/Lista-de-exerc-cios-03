interface Trabalhador {
    void trabalhar();
}

class Funcionario implements Trabalhador {
    public void trabalhar() {
        System.out.println("Funcionário trabalhando...");
    }
}

class Gerente implements Trabalhador {
    public void trabalhar() {
        System.out.println("Gerente trabalhando...");
    }
}

class Empresa {
    public void adicionarTrabalhador(Trabalhador trabalhador) {
        trabalhador.trabalhar();
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();

        Empresa empresa = new Empresa();

        empresa.adicionarTrabalhador(funcionario);
        empresa.adicionarTrabalhador(gerente);
    }
}
