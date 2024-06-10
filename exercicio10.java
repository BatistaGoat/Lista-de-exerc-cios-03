abstract class Veiculo {
    abstract void mover();
}

class Carro extends Veiculo {
    @Override
    void mover() {
        System.out.println("Carro se movendo na estrada.");
    }
}

class Moto extends Veiculo {
    @Override
    void mover() {
        System.out.println("Moto se movendo na rua.");
    }
}

public class Main {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[2];

        veiculos[0] = new Carro();
        veiculos[1] = new Moto();

        for (Veiculo veiculo : veiculos) {
            veiculo.mover();
        }
    }
}
