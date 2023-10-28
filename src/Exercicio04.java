import java.util.Scanner;

public class Exercicio04 {
    public static void Ex4(){
        /**
         4. Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.
         **/

        Scanner ler = new Scanner(System.in);

        System.out.println("Utlize medidas iguais para todas as dimensões");

        System.out.println(" ");

        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

        System.out.println(" ");

        System.out.println("Digite a altura da parede: ");
        double hp = ler.nextDouble();

        System.out.println("Digite a largura da parede: ");
        double lp = ler.nextDouble();


        System.out.println(" ");

        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

        System.out.println(" ");


        System.out.println("Digite a altura do azulejo:");
        double ha = ler.nextDouble();

        System.out.println("Digite a largura do azulejo: ");
        double la = ler.nextDouble();

        System.out.println(" ");

        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

        System.out.println(" ");


        double areaParede = hp * lp;

        System.out.println("A area da parede é: " + areaParede);

        double areaAzulejo = ha * la;

        System.out.println("A area do azulejo é: " + areaAzulejo);


        System.out.println(" ");

        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

        System.out.println(" ");


        double qtdAzulejos = areaParede / areaAzulejo;

        System.out.println("A quantidade de azulejos necessarios para cobrir a parede é de: " + qtdAzulejos);
    }

}
