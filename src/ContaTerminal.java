import java.util.*;
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("=                                           =");
        System.out.println("=       Por favor, digite o seu nome!       =");
        System.out.println("=                                           =");
        System.out.println("=============================================");
        String nome = input.nextLine();

        System.out.println("=============================================");
        System.out.println("=                                           =");
        System.out.println("=  Por favor, digite o número da Agência !  =");
        System.out.println("=                                           =");
        System.out.println("=============================================");
        String agencia = input.nextLine();

        System.out.println("=============================================");
        System.out.println("=                                           =");
        System.out.println("=  Por favor, digite o número da sua conta! =");
        System.out.println("=                                           =");
        System.out.println("=============================================");
        int conta = input.nextInt();

        System.out.println("=============================================");
        System.out.println("=                                           =");
        System.out.println("=  Por favor, digite o seu saldo!           =");
        System.out.println("=                                           =");
        System.out.println("=============================================");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " +
                "conta " + conta +  " e seu saldo " + saldo + " já está disponível para saque.");


    }
}