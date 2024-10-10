import java.util.Scanner;

public class DesafioMacTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

         System.out.println("Olá, bem-vindos!");

            System.out.print("Digite o nome da primeira pessoa: ");
                String nome01 = scanner.nextLine();
                    System.out.println(nome01);

        System.out.print("Digite a idade da primeira pessoa: ");
            int idade01 = Integer.parseInt(scanner.nextLine());
                 System.out.println(idade01);

        System.out.print("Digite o nome da sengunda pessoa: ");
            String nome02 = scanner.nextLine();
                System.out.println(nome02);

        System.out.print("Digite a idade da segunda pessoa: ");
             int idade02 = Integer.parseInt(scanner.nextLine());
                 System.out.println(idade02);

                 int diferenca = idade01 - idade02;
                 int diferencaTratada = diferenca < 0 ? diferenca * -1 : diferenca;

        System.out.println("A diferença de idade de "+nome01+" e "+nome02+" é de "+diferencaTratada+" anos.");

        scanner.close();




    }
}
