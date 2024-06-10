import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
        //Exibir as mensagens para o nosso usuário

        System.out.println("Por favor, digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();
        nomeCliente = nomeCliente.toUpperCase();

        String numeroAgencia;
        while(true) {
        System.out.println("Por favor, digite apenas o número da Agência no formato xxx-x, inserindo o - antes do último número: ");
        numeroAgencia = scanner.nextLine();
        if (numeroAgencia.matches("\\d{3}-\\d")){
            break;
        }else{
            System.out.println("Formato inválido. Tente novamente.");
        }
        }

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite a quantidade do saldo que deseja sacar: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está desponivel para saque");

        }
    }
}
