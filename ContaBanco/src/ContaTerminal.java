import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Entrada de dados do usuário usando a classe Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua conta: ");
        int conta = sc.nextInt();
        sc.nextLine(); // Consome a quebra de linha deixada pelo nextInt()

        System.out.print("Digite sua agência: ");
        String agencia = sc.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Qual o seu saldo: ");
        double saldo = sc.nextDouble();

        sc.close(); // Sempre bom fechar o Scanner para liberar recursos.

        // Exibição da mensagem final formatada
        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque!");
    }
}
