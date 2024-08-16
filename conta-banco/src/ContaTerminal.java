import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = Integer.parseInt(leitura.nextLine());

        System.out.println("Informe o número da agência: ");
        agencia = leitura.nextLine();

        System.out.println("Informe o nome do cliente: ");
        nomeCliente = leitura.nextLine();

        System.out.println("Informe o saldo da conta: ");
        saldo = Double.parseDouble(leitura.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
    


    }
}
