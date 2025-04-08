package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
            public static void main (String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Por favor digite os dados da conta bancária");

                System.out.print("Número da agência(Texto - Ex: 067-3):");
                      String agencia = scanner.nextLine();
                System.out.print("Número da conta(Texto - Ex: 1234-5):");
                       int numeroContaBanco = scanner.nextInt();
                System.out.print("Nome do Cliente(Texto - Ex: <NAME> ):");

                String nomeCliente = scanner.nextLine();

                System.out.print("Saldo da conta(Numero - Ex: 1000.00):");
                    double saldo = scanner.nextDouble();

                System.out.print("Numero da conta(Numero - Ex: 1234-5):");
                double numeroConta = scanner.nextDouble();

                System.out.println("\nDados da Conta");
                System.out.println("Agência: " + agencia);
                System.out.println("Numero da conta: " + numeroContaBanco);
                System.out.println("Nome do Cliente: " + nomeCliente);
                System.out.println("Saldo: " + saldo);
                System.out.println("Numero da conta: " + numeroConta);

    }


}