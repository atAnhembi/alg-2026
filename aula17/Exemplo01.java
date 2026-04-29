import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TAMANHO = 5; // usando uma constante
        // int tamanho = 5; // usando uma variável

        int numeros[] = new int[TAMANHO];
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um valor inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        media = calculaMedia(numeros);

        System.out.println("Números digitados: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nMédia = " + media);

        System.out.println("Números maiores que a média:");
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > media) {
                System.out.print(numeros[i] + " ");
            }
        }

        scanner.close();
    }

    static double calculaMedia(int valores[]) {
        double media = 0;
        for (int i = 0; i < valores.length; i++) {
            media += valores[i];
        }
        return media / valores.length;
    }

}
