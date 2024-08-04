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


        System.out.println("1 - Sacar tudo?");
        System.out.println("2 - Sacar quatidade.");

        int opcao_1 = input.nextInt();


        if (opcao_1 == 1 ){
            saldo = 0;
            System.out.println("Olá " + nome + ", sua agência é " + agencia + ", " +
                    "conta " + conta +  " e seu saldo " + saldo + ". Você acabou de sacar tudo");
        }

        if (opcao_1 == 2 ){
            System.out.println("Digite a quantidade:");
            int quantidade = input.nextInt();
            double saldo_1 = saldo - quantidade;
            System.out.println("Olá " + nome + ", sua agência é " + agencia + ", " +
                    "conta " + conta +  " e seu saldo agora é: " + saldo_1 + ".");
        }

        else {
            System.out.println("Opção errada, digite a quantidade:");


        }


    }
}

