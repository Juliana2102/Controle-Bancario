import java.util.Scanner;

public class ContoleFluxoBancario {
    public static void main(String[] args) {
        String nomeCliente = "Maíra Luana Viana Prado";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.99;
        int opcao = 0;


        System.out.println("****************************************");
        System.out.println("\n Nome do Cliente: " + nomeCliente);
        System.out.println(" Tipo de conta: " + tipoConta);
        System.out.println(" Valor Inicial da conta: " + saldoInicial);
        System.out.println("\n****************************************");


        String menu = """
                ** Menu de opções:
                1- Visualização do saldo
                2- Enviar valor
                3- Receber valor
                4- Sair
                """;

        Scanner leitura = (new Scanner(System.in));

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo é " + saldoInicial);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();

                if (valor > saldoInicial){
                    System.out.println(" Não há valor para transferência ");
                }else {
                    saldoInicial -= valor;
                    System.out.println(" Novo saldo: " + saldoInicial);
                }

            } else if (opcao == 3) {
                System.out.println(" Valor recebido: ");
                double valor = leitura.nextDouble();
                saldoInicial += valor;
                System.out.println(" Novo saldo: " + saldoInicial);
            } else if (opcao != 4) {
                System.out.println(" Opção inválida! ");

            }
        }

    }
}

