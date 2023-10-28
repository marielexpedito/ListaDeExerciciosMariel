import java.util.Scanner;

public class Exercicio06 {
    public static void Ex6(){
        /**
         6. Escreva um programa para determinar a quantidade de cavalos necessários para se levantar uma massa de m quilogramas a uma altura de h metros em t segundos. Considere cavalos = (m * h / t) / 745,6999
         **/

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a massa em quilogramas: ");
        double massa = ler.nextDouble();


        System.out.println(" ");

        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

        System.out.println(" ");


        System.out.println("Digite a altura em metros: ");
        double altura = ler.nextDouble();

        System.out.println(" ");

        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

        System.out.println(" ");


        System.out.println("Digite o tempo em segundos: ");
        double tempo = ler.nextDouble();


        System.out.println(" ");

        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

        System.out.println(" ");


        double cavalos = (massa * altura / tempo) / 745.6999;

        System.out.println("A quantidade de cavalos necessários para levantar " + massa + "kg de massa a uma altura de " + altura + " metros em " + tempo + " segundos, é de: " + cavalos + " cavalos");

    }
}
