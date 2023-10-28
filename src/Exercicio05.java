import java.util.Scanner;

public class Exercicio05 {
    public static void Ex5(){
        /**
         5. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A, em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
         Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as variáveis de altura e de raio. Agora vamos escrever a fórmula, conforme dita no enunciado e, em seguida, exibir na tela uma mensagem contendo o resultado do volume encontrado.
         **/

        Scanner ler = new Scanner(System.in);

        System.out.println("Utlize medidas iguais para todas as dimensões");


        System.out.println(" ");

        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

        System.out.println(" ");


        System.out.println("Digite o raio da lata: ");
        double raio = ler.nextDouble();


        System.out.println(" ");

        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

        System.out.println(" ");


        System.out.println("Digite a altura da lata: ");
        double altura = ler.nextDouble();


        System.out.println(" ");

        System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

        System.out.println(" ");


        double volume = 3.14159 * raio * raio * altura;

        System.out.println("O volume da lata de óleo é: " + volume);

    }
}
