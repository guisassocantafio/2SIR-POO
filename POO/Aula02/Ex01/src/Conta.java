import java.util.Random;

public class Conta {
    String nome;
    int numeroDaConta;
    double saldo;

    public int gerarNumeroDaConta() {
        Random random = new Random();
        numeroDaConta = random.nextInt(9999);
        return numeroDaConta;
    }

    public double calcularSaldo() {
        saldo = 0;
        return saldo;
    }
}
