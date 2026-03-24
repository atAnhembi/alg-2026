import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, pares = 0, impares = 0;
        int somaValoresPares = 0;
        boolean ehPar;

        for (int i = 0; i < 10; i++) {
            System.out.println("\nDigite um número inteiro:");
            numero = teclado.nextInt();

            ehPar = (numero % 2) == 0;
            if (ehPar == true) {
                somaValoresPares = somaValoresPares + numero;
                pares++; // pares = pares + 1;
            } else {
                impares++;
            }
        }
        System.out.println("Pares = " + pares);
        System.out.println("Soma dos pares = " + somaValoresPares);
        System.out.println("Média dos pares = " + (double)somaValoresPares /  pares);
        System.out.println("Impares = " + impares);
        System.out.println("Porcentagem de impares = " + ((double)impares / 10) * 100 + " %");

        teclado.close();
    }
}
