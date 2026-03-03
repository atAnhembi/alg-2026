import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor1, valor2, soma;

        // entrada de dados
        System.out.println("\nDigite um número:");
        valor1 = entrada.nextDouble();
        System.out.println("\nDigite outro número:");
        valor2 = entrada.nextDouble();

        // processamento
        soma = valor1 + valor2;

        // saída
        System.out.println("A soma é " + soma);

        entrada.close();
    }
}
