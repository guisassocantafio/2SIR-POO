import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta c = new Conta();
        System.out.print("Digite o nome do Cliente: ");
        c.nome = sc.nextLine();

        c.gerarNumeroDaConta();

        boolean status = true;

        while (status) {
            System.out.println("Banco NeoBank");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar conta");
            System.out.println("4 - Sair");
            System.out.print("Digite a opcao desejada: ");

            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("------------------------");
                System.out.println("Saldo atual: " + c.saldo);
                System.out.print("Valor do deposito: R$");
                c.saldo = c.saldo + sc.nextDouble();
            }
            else if (opcao == 2) {
                System.out.println("------------------------");
                System.out.println("Saldo atual: " + c.saldo);
                System.out.print("Valor do saque: R$");
                c.saldo = c.saldo - sc.nextDouble();
            }
            else if (opcao == 3) {
                System.out.println("------------------------");
                System.out.println("Nome do cliente: " + c.nome);
                System.out.println("Numero da conta: " + c.numeroDaConta);
                System.out.println("Saldo atual: " + c.saldo);
                System.out.println("------------------------");
            }
            else if (opcao == 4) {
                System.out.println("------------------------");
                System.out.println("Obrigado por usar o NeoBank");
                status = false;
            }
            else {
                System.out.println("------------------------");
                System.out.println("Opcao Invalida, digite novamente.");
            }
        }
    }
}
