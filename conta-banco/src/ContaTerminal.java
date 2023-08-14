import java.util.Scanner; 

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
         
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Bem Vindo ao Banco da DIO!");
        System.out.println("Por gentileza digite o numero da Conta: ");
        numero = scanner.nextInt();

        System.out.println("Por gentileza digite a Agencia: ");
        agencia = scanner.next();

        scanner.nextLine(); // para evitar que seja pulada a leitura do nome.
        System.out.println("Por gentileza digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por gentileza digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        System.out.println("\n\n\n");

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque. \n\n");

    }

}
