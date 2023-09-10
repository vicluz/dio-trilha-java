import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");


        System.out.println("Por Favor,digite o seu nome");
        String nome = scanner.nextLine();


        System.out.println(" ");


        System.out.println("Por Favor,digite o numero da Agência");
        int agencia = scanner.nextInt();

        System.out.println(" ");

        System.out.println("Digite o numero da sua conta");
        int conta = scanner.nextInt();

        System.out.println(" ");

        System.out.println("Digite o numero do digito");
        int digito = scanner.nextInt();

        System.out.println(" ");


        System.out.println("Digite o saldo que deseja colocar ");
        double saldo = scanner.nextDouble();

        String contaEDigito = conta + "-" + digito;






        if (agencia == 6607 && contaEDigito.equals("4321-2")){
            System.out.println(" ");
            System.out.println("Olá "+ nome + ", Obrigado por fazer a conta conosco"
            + ", sua agencia é "+ agencia +  " conta: "+ contaEDigito
            + " seu saldo disponivel para saque é de  " + saldo )  ;
        }else {
            System.out.println("Olá " + nome + " algo deu errado "
                    + "por favor tente novamente mais tarde");


        }










    }
}
