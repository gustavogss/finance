import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String nome = "Gustavo";
        String conta = "Corrente";
        double saldo = 1521;
        int opcao = 0;

        System.out.println("**************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + conta);
        System.out.println("Saldo atual: " +saldo);
        System.out.println("\n**************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair               
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao !=4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Seu saldo atual é: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser transferido: ");
                    double valor = leitura.nextDouble();
                    if(valor > saldo){
                        System.out.println("Não há saldo para transferir esse valor");
                    } else{
                        saldo -= valor;
                        System.out.println("Seu novo saldo é: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Qual o valor recebido: ");
                    double valorRecebido = leitura.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("Seu novo saldo é: " + saldo);
                    break;
                default:
                    System.out.println("Sair ! ");
                    break;
            }

        }

    }
}