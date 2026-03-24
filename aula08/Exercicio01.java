import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, pares = 0, impares = 0;
        boolean ehPar;

        for (int i = 0; i < 10; i++) {
            System.out.println("\nDigite um número inteiro:");
            numero = teclado.nextInt();

            ehPar = (numero % 2) == 0;
            if (ehPar == true) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares = " + pares);
        System.out.println("Impares = " + impares);

        teclado.close();
    }
}
