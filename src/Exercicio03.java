import java.util.Scanner;

public class Exercicio03 {
    public static void Ex3(){
        /**
         3. Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
         **/

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade de funcionarios: ");
        int qtdFuncionarios = ler.nextInt();

        double salarioTotal = 0;

        System.out.println(" ");

        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

        System.out.println(" ");

        for(int i = 1; i <= qtdFuncionarios; i++){

            System.out.println("Digite o nome do " + i + "° funcionario: ");
            String nomeFuncionario = ler.next();

            System.out.println(" ");

            System.out.println("Digite o salrio do " + i + "° funcionario: ");
            double salario = ler.nextDouble();

            System.out.println(" ");

            System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

            System.out.println(" ");

            salarioTotal += salario;

        }

        double mediaSalario = salarioTotal / qtdFuncionarios;

        System.out.println("A media salarial é de: " + mediaSalario);

    }
}
